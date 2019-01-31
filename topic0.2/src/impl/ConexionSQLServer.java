package impl;

import iConexion.iConexion;

public class ConexionSQLServer implements iConexion {
    private String host;
    private String port;
    private String user;
    private String password;

    public ConexionSQLServer(){
        this.host = "localhost";
        this.password = "3301";
        this.port = "root";
        this.password = "124";
    }

    @Override
    public void connect() {
        System.out.println("Conected to MySQLServer");
    }
    @Override
    public void disconnect(){
        System.out.println("Disconnected to MySQL ");
    }
}
