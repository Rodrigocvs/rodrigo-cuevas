package impl;

import iConexion.iConexion;

public class ConexionMySQL implements iConexion {

    private String host;
    private String port;
    private String user;
    private String password;

    public ConexionMySQL(){
        this.host = "localhost";
        this.password = "3302";
        this.port = "root";
        this.password = "123";
    }

    @Override
    public void connect() {
        System.out.println("Conected to MySQL");
    }

    @Override
    public void disconnect(){
        System.out.println("Disconnected to MySQL ");
    }

}
