package G03;

import G03.Contenedores;

public class Hub {
    private Contenedores[][] c=new Contenedores[10][12];

    public Hub() {
        for(int i=0;i<10;i++){
            for(int j=0;j<12;j++){
                c[i][j].setIdentificador(0);
            }
        }
    }

    public String PlanoHub() {
        String s = " ";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if (c[i][j].getIdentificador() != 0) {
                    s = s + "|" + "Ocupado" + "|";
                } else {
                    s = s + "|" + "Libre" + "|";
                }
            }
            s=s+"\n";
        }
        return s;
    }
    public String mostrar_datos(int id){
        String datos;
        for(int i=0;i<10;i++){
            for(int j=0;j<12;j++){
                if(c[i][j].getIdentificador()==id){
                    datos=c[i][j].toString();
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
                if (c[i][j].getPais_procedencia() == pais) {
                    num_pais++;
                }
            }
        }
        return "El número de contenedores de " + pais + " es de " + num_pais;
    }

    public int desapila_contenedor(int columna){
        for(int i=0;i<10;i++){
            if(c[i][columna].getIdentificador()!=0){
                c[i][columna].setIdentificador(0);
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
                if (c[i][0].getIdentificador() == 0) {
                    c[i][0] = contenedores;
                }
            }
        } else if (contenedores.getPrioridad() == 2) {
            for (int i = 9; i >= 0; i--) {
                if (c[i][1].getIdentificador() == 0) {
                    c[i][1] = contenedores;
                }
            }
        } else if (contenedores.getPrioridad() == 3) {
            for (int i = 9; i >= 0; i--) {
                for (int j = 11; j > 1; j--) {
                    if (c[i][j].getIdentificador() == 0) {
                        c[i][j] = contenedores;
                        break;
                    }
                }
            }
        } else {
            System.out.println("La prioridad del contenedor debe estar entre 1 y 3");
        }
    }
}