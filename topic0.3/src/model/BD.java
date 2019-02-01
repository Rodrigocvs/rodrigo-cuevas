package model;

import topic03.Connectiondb;

import javax.print.DocFlavor;

public class BD implements Connectiondb {

    private String user;
    private String password;
    private int host;
    private int server;

    public BD ( String user, String password , int host , int server) {

        this.host = host;
        this.password = password;
        this.server = server;
        this.user = user;
    }

    public String getUser () {
        return user;
    }

    public String getPassword (){
        return password;
    }

    public int getHost () {
        return host;
    }

    public int getServer (){
        return server;
    }
    @Override
    public void connect() {
        System.out.println("Coneccion exitosa");
    }

}




