package impl;

import iConexion.iConexion;

public class ConexionEmpty implements  iConexion{

    @Override
    public void connect() {
        System.out.println("Empty");
    }
    @Override
    public void disconnect(){
        System.out.println("Empty");
    }

}
