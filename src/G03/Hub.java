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

    public String toString() {
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
        String datos=new String();
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
}