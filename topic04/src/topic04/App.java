package topic04;

import topic04.BD.BuilderMySQL;

public class App {

    public static void main(String[] args) {
        BDDir bdDir = new BDDir(new BuilderMySQL());

        bdDir.createConnection();

        System.out.println("User: " + bdDir.getConnection().getUser());
        System.out.println("Host: " + bdDir.getConnection().getHost());
    }
}
