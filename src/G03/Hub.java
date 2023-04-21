package G03;

import G03.Contenedores;

public class Hub {
    private Contenedores[][] c=new Contenedores[10][12];

    public Hub() {
        for(int i=0;i<10;i++){
            for(int j=0;j<12;j++){
                this.c[i][j]=new Contenedores(0,0,"a",false,0, "a".toCharArray(), "a".toCharArray(), "a".toCharArray());
            }
        }
    }

    public String PlanoHub() {
        String s = " ";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if (this.c[i][j].getIdentificador() != 0) {
                    s = s + "|" + "Ocupado" + "|";
                } else {
                    s = s + "|" + "Libre" + "|";
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
                if (this.c[i][0].getIdentificador() == 0) {
                    this.c[i][0].setIdentificador(contenedores.getIdentificador());
                    this.c[i][0].setPeso(contenedores.getPeso());
                    this.c[i][0].setPais_procedencia(contenedores.getPais_procedencia());
                    this.c[i][0].setPrioridad(contenedores.getPrioridad());
                    this.c[i][0].setInspeccion(contenedores.isInspeccion());
                    this.c[i][0].setDescripcion(contenedores.getDescripcion());
                    this.c[i][0].setEmpresa_envio(contenedores.getEmpresa_envio());
                    this.c[i][0].setEmpresa_recibe(contenedores.getEmpresa_recibe());
                }
            }
        } else if (contenedores.getPrioridad() == 2) {
            for (int i = 9; i >= 0; i--) {
                if (this.c[i][1].getIdentificador() == 0) {
                    this.c[i][1].setIdentificador(contenedores.getIdentificador());
                    this.c[i][1].setPeso(contenedores.getPeso());
                    this.c[i][1].setPais_procedencia(contenedores.getPais_procedencia());
                    this.c[i][1].setPrioridad(contenedores.getPrioridad());
                    this.c[i][1].setInspeccion(contenedores.isInspeccion());
                    this.c[i][1].setDescripcion(contenedores.getDescripcion());
                    this.c[i][1].setEmpresa_envio(contenedores.getEmpresa_envio());
                    this.c[i][1].setEmpresa_recibe(contenedores.getEmpresa_recibe());
                }
            }
        } else if (contenedores.getPrioridad() == 3) {
            for (int i = 9; i >= 0; i--) {
                for (int j = 11; j > 1; j--) {
                    if (this.c[i][j].getIdentificador() == 0) {
                        this.c[i][j].setIdentificador(contenedores.getIdentificador());
                        this.c[i][j].setPeso(contenedores.getPeso());
                        this.c[i][j].setPais_procedencia(contenedores.getPais_procedencia());
                        this.c[i][j].setPrioridad(contenedores.getPrioridad());
                        this.c[i][j].setInspeccion(contenedores.isInspeccion());
                        this.c[i][j].setDescripcion(contenedores.getDescripcion());
                        this.c[i][j].setEmpresa_envio(contenedores.getEmpresa_envio());
                        this.c[i][j].setEmpresa_recibe(contenedores.getEmpresa_recibe());
                        break;
                    }
                }
            }
        } else {
            System.out.println("La prioridad del contenedor debe estar entre 1 y 3");
        }
    }
}