package G03;

import G03.Contenedores;

public class Hub {
    private Contenedores[][] c;

    public Hub() {
        c=new Contenedores[10][12];
        for(int i=0;i<10;i++){
            for(int j=0;j<12;j++){
                this.c[i][j]=null;
            }
        }
    }

    public String PlanoHub() {
        String s = " ";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if (this.c[i][j]==null) {
                    s = s + "|" + "Libre" + "|";
                } else {
                    s = s + "|" + "Ocupado" + "|";
                }
            }
            s=s+"\n";
        }
        System.out.println(s);
        return s;
    }
    public String mostrar_datos(int id){
        String datos;
        for(int i=0;i<10;i++){
            for(int j=0;j<12;j++){
                if(this.c[i][j].getIdentificador()==id){
                    datos=this.c[i][j].toString();
                    System.out.println(datos);
                    return datos;
                }
            }
        }
        datos="Ese contenedor no esta en el hub";
        return datos;
    }

    public String contenedores_pais(String pais){
        int num_pais=0;
        for(int i=0;i<10;i++){
            for(int j=0;j<12;j++) {
                if (this.c[i][j].getPais_procedencia() == pais) {
                    num_pais++;
                }
            }
        }
        return "El número de contenedores de " + pais + " es de " + num_pais;
    }

    public int desapila_contenedor(int columna){
        for(int i=0;i<10;i++){
            if(this.c[i][columna].getIdentificador()!=0){
                this.c[i][columna].setIdentificador(0);
                System.out.println("Se ha desapilado correctamente");
               return 0;
            }
            else {
                System.out.println("En la posicion "+(i+1)+", "+(columna+1)+" no hay contenedor");
            }
        }
        return 0;
    }
    public void ApilarContenedor(Contenedores contenedores) {
        if (contenedores.getPrioridad() == 1) {
            for (int i = 9; i >= 0; i--) {
                if (this.c[i][0]==null) {
                    this.c[i][0]=contenedores;
                }
            }
        } else if (contenedores.getPrioridad() == 2) {
            for (int i = 9; i >= 0; i--) {
                if (this.c[i][1]==null) {
                    this.c[i][1]=contenedores;
                }
            }
        } else if (contenedores.getPrioridad() == 3) {
            for (int i = 9; i >= 0; i--) {
                for (int j = 11; j > 1; j--) {
                    if (this.c[i][j]==null) {
                        this.c[i][j]=contenedores;
                        break;
                    }
                }
            }
        } else {
            System.out.println("La prioridad del contenedor debe estar entre 1 y 3");
        }
    }
}