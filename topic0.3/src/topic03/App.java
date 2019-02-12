package topic03;

public class App {

    public static void main(String[] args) {
        Connectiondb bd = new DBProxy("Rodrigo" , "bbb" , 123 , 1233);

        bd.connect();
    }
}
