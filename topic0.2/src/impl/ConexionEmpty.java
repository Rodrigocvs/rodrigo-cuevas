package impl;

import iConexion.Conexion;

public class ConexionEmptyImp implements  iConexion{

    @Override
    public void connect() {
        System.out.println("Empty");
    }
    @Override
    public void disconnect(){
        System.out.println("Empty");
    }

}
