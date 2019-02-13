import java.time.LocalDateTime;


public class Blog {

    private String name;
    private LocalDateTime date;
    private String url;

    public Blog (String name , String url) {
        this.name = name;
        this.date = LocalDateTime.now();
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
