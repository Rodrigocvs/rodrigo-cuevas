package topic02;

import iConexion.factoryAbs;
import iConexion.Conexion;

public class App {
    public static void main(String[] args) {

        factoryAbs factoryBD = factoryProducer.getFactory("BD");
        iConexion cxBD1 = factoryBD.getBD("MySQL");

        cxBD1.connect();
        cxBD1.disconnect();


    }
}
