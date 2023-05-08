package G03;

public class Puerto {
    Hub Puerto []=new Hub[3];

    public Puerto(){
        for(int i=0;i< Puerto.length;i++){
            Puerto[i]=null;
        }
    }

    public void Apilar(Contenedores cont) {
        for (int i = 0; i < 3; i++) {
            if (Puerto[i].ApilarContenedor(cont) == 1) {
                System.out.println("Se ha apilado correctamente");
                break;
            }
        }
    }
    public void Desapilar(int columna) {
        for (int i = 0; i < 3; i++) {
            if (Puerto[i].desapila_contenedor(columna)== 1) {
                System.out.println("Se ha desapilado correctamente");
                break;
            }
        }
    }
    public void Plano(Contenedores cont) {
        for (int i = 0; i < 3; i++) {
            Puerto[i].PlanoHub();
            }
        }
    public void Datos(int id) {
        for (int i = 0; i < 3; i++) {
            Puerto[i].mostrar_datos(id);
        }
    }
    public void Pais(String Pais) {
        for (int i = 0; i < 3; i++) {
            Puerto[i].contenedores_pais(Pais);
        }
    }
    }

