package iConexion;

public interface factoryAbs {

    //defino para obtener la base de datos
    Conexion getBD(String motor);
}
