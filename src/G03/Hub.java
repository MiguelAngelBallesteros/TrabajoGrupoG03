package G03;

import G03.Contenedores;

public class Hub {
    private Contenedores[][] c;
    public Hub(){

    }
    public String toString(){
        String s= "";
        for(int i=0;i<10;i++){
            System.out.println("En la fila"+(i+1)+"están");
            for(int j=0;j<12;j++){
                s=s+", "+c[i][j];
            }
        }
        return s;
    }
}
