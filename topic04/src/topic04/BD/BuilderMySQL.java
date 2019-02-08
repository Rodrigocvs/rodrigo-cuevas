package topic04.BD;

import topic04.BuilderBD;
import topic04.ConnectionBD;

public class BuilderMySQL implements BuilderBD {

    private ConnectionBD bdConnect;

    public BuilderMySQL() {
        this.bdConnect = new ConnectionBD();
    }

    @Override
    public void buildUser() {
        bdConnect.setUser("Conectado a My SQL");
    }

    @Override
    public void buildHost() {
        bdConnect.setHost( 123 );
    }

    @Override
    public ConnectionBD getConnection() {
        return this.bdConnect;
    }
}
