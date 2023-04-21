package G03;

import G03.Contenedores;

public class Hub {
    private Contenedores[][] c=new Contenedores[10][12];

    public Hub() {
        for(int i=0;i<10;i++){
            for(int j=0;j<12;j++){
                c[i][j]=new Contenedores(0,0,"a",false,0, "a".toCharArray(), "a".toCharArray(), "a".toCharArray());
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
        System.out.println(s);
        return s;
    }
    public String mostrar_datos(int id){
        String datos;
        for(int i=0;i<10;i++){
            for(int j=0;j<12;j++){
                if(c[i][j].getIdentificador()==id){
                    datos=c[i][j].toString();
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
                if (c[i][0].getIdentificador() == 0) {
                    c[i][0].setIdentificador(contenedores.getIdentificador());
                    c[i][0].setPeso(contenedores.getPeso());
                    c[i][0].setPais_procedencia(contenedores.getPais_procedencia());
                    c[i][0].setPrioridad(contenedores.getPrioridad());
                    c[i][0].setInspeccion(contenedores.isInspeccion());
                    c[i][0].setDescripcion(contenedores.getDescripcion());
                    c[i][0].setEmpresa_envio(contenedores.getEmpresa_envio());
                    c[i][0].setEmpresa_recibe(contenedores.getEmpresa_recibe());
                }
            }
        } else if (contenedores.getPrioridad() == 2) {
            for (int i = 9; i >= 0; i--) {
                if (c[i][1].getIdentificador() == 0) {
                    c[i][1].setIdentificador(contenedores.getIdentificador());
                    c[i][1].setPeso(contenedores.getPeso());
                    c[i][1].setPais_procedencia(contenedores.getPais_procedencia());
                    c[i][1].setPrioridad(contenedores.getPrioridad());
                    c[i][1].setInspeccion(contenedores.isInspeccion());
                    c[i][1].setDescripcion(contenedores.getDescripcion());
                    c[i][1].setEmpresa_envio(contenedores.getEmpresa_envio());
                    c[i][1].setEmpresa_recibe(contenedores.getEmpresa_recibe());
                }
            }
        } else if (contenedores.getPrioridad() == 3) {
            for (int i = 9; i >= 0; i--) {
                for (int j = 11; j > 1; j--) {
                    if (c[i][j].getIdentificador() == 0) {
                        c[i][j].setIdentificador(contenedores.getIdentificador());
                        c[i][j].setPeso(contenedores.getPeso());
                        c[i][j].setPais_procedencia(contenedores.getPais_procedencia());
                        c[i][j].setPrioridad(contenedores.getPrioridad());
                        c[i][j].setInspeccion(contenedores.isInspeccion());
                        c[i][j].setDescripcion(contenedores.getDescripcion());
                        c[i][j].setEmpresa_envio(contenedores.getEmpresa_envio());
                        c[i][j].setEmpresa_recibe(contenedores.getEmpresa_recibe());
                        break;
                    }
                }
            }
        } else {
            System.out.println("La prioridad del contenedor debe estar entre 1 y 3");
        }
    }
}