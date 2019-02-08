package topic02;

import iConexion.factoryAbs;
import impl.ConexionEmpty;
import impl.ConexionMySQL;
import impl.ConexionOracle;
import impl.ConexionSQLServer;

public class ConexionBDFactory implements factoryAbs {

    @Override
    public iConexion.iConexion getBD (String motor) {
        if (motor == null) {
            return new ConexionEmpty();
        }
        if (motor.equalsIgnoreCase("MySQL")) {
            return new ConexionMySQL();
        } else if (motor.equalsIgnoreCase("Oracle")) {
            return new ConexionOracle();
        } else if (motor.equalsIgnoreCase("SQLServer")) {
            return new ConexionSQLServer();
        }
        return new ConexionEmpty();
    }



}
