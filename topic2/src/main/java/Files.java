import java.util.Date;

public class Files {
    public String name;
    public int size;
    public String location;
    public Date dateCreation;

    public Files(String name, int size, String location, Date dateCreation) {
        this.name = name;
        this.size = size;
        this.location = location;
        this.dateCreation = dateCreation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getLocation() {
        return location;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

}
