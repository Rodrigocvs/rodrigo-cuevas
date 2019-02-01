package topic03;

import model.BD;

public class DBProxy implements Connectiondb {

    private BD BDcon;
    private String user;
    private String password;
    private int host;
    private int server;

    public DBProxy (String user , String password , int host , int server ) {
        this.user = user;
        this.password = password;
        this.host = host;
        this.server = server;

    }

    @Override
    public void connect() {
        if (BDcon == null) {
            BDcon = new BD(this.user , this.password , this.host , this.server);
        }
        BDcon.connect();
    }
}
