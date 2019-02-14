package App;

import topic01.conexion ;

public class App {
    public static void main(String[] args) {
        conexion c = conexion.getInstance();
        c.connect();
        c.disconnect();
    }
}
