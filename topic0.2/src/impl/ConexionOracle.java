package impl;
import iConexion.iConexion;

public class ConexionOracle implements iConexion {

        private String host;
        private String port;
        private String user;
        private String password;

        public ConexionOracle(){
            this.host = "localhost";
            this.password = "3301";
            this.port = "root";
            this.password = "124";
        }
        @Override
        public void connect() {
            System.out.println("Conected to Oracle");
        }
        @Override
        public void disconnect(){
            System.out.println("Disconnected to Oracle ");
        }
}
