package topic01;

public class conexion {

        private static conexion instance;

        // private area builder, to not use operator new
        private conexion() {
        }

        public static conexion getInstance() {
            if (instance == null) {
                instance = new conexion();
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
