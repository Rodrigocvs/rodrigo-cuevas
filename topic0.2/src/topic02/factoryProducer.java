package topic02;

import iConexion.factoryAbs;

public class factoryProducer {

    public static factoryAbs getFactory(String typeFactory) {
        if (typeFactory.equalsIgnoreCase("BD")) {
            return new ConexionBDFactory();
        }
        return null;
    }
}
