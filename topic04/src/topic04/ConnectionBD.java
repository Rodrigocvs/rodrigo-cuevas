package topic04;

public class ConnectionBD implements ConnectionBDP {

    private String user;
    private int host;

    public String getUser(){
        return user;
    }

    public int getHost() {
        return host;
    }

    @Override
    public  void setUser (String user) {
        this.user = user;
    }

    @Override
    public void setHost (int host) {
        this.host = host;
    }


}
