package G03;

import G03.Contenedores;

public class Hub {
    private Contenedores[][] c;

    public Hub() {

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
}