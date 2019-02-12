package topic02;

import iConexion.factoryAbs;
import impl.ConexionEmpty;
import impl.ConexionMySQL;
import impl.ConexionOracle;
import impl.ConexionSQLServer;

public class ConexionBDFactory implements factoryAbs {

    @Override
    public iConexion.Conexion getBD (String motor) {
        if (motor == null) {
            return new ConexionEmptyImp();
        }
        if (motor.equalsIgnoreCase("MySQL")) {
            return new ConexionMySQLImp();
        } else if (motor.equalsIgnoreCase("Oracle")) {
            return new ConexionOracleImp();
        } else if (motor.equalsIgnoreCase("SQLServer")) {
            return new ConexionSQLServerImp();
        }
        return new ConexionEmptyImp();
    }



}
