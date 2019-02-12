package impl;
import iConexion.Conexion;

public class ConexionOracleImp implements Conexion {

        private String host;
        private String port;
        private String user;
        private String password;

        public ConexionOracleImp(){
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
