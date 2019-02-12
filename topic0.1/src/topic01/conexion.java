package topic01;

public class Conexion {

        private static Conexion instance;

        // private area builder, to not use operator new
        private conexion() {
        }

        public static Conexion getInstance() {
            if (instance == null) {
                instance = new Conexion();
            }
            return instance;
        }

        //testing method

        public void connect() {
            System.out.println("Connected");
        }

        public void disconnect() {
            System.out.println("Disconected");
        }

    }
