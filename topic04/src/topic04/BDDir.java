package topic04;

public class BDDir {

    private BuilderBD bdbuilder;

    public BDDir (BuilderBD bdbuilder) {
        this.bdbuilder = bdbuilder ;
    }

    public void setBdbuilder (BuilderBD bdbuilder) {
        this.bdbuilder = bdbuilder;
    }

    public ConnectionBD getConnection() {
        return this.bdbuilder.getConnection();
    }

    public void createConnection(){
        this.bdbuilder.buildHost();
        this.bdbuilder.buildUser();
    }
}
