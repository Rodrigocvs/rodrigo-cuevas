package topic02;

import iConexion.iConexion;
import impl.ConexionEmpty;
import impl.ConexionMySQL;
import impl.ConexionOracle;
import impl.ConexionSQLServer;

public class factory {
    public iConexion getConexion(String motor) {
        if (motor == null) {
            return new ConexionEmpty();
        }
        if (motor.equalsIgnoreCase(("MySQL"))) {
            return new ConexionMySQL();
        } else if (motor.equalsIgnoreCase(("SQLServer"))) {
            return new ConexionSQLServer();
        } else if (motor.equalsIgnoreCase(("Oracle"))) {
            return new ConexionOracle();
        }
        return new ConexionEmpty();

    }
}