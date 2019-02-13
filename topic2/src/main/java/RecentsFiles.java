import java.util.ArrayList;

public class RecentsFiles {
    private ArrayList<Files> list;

    private int max = 15;

    public RecentsFiles(int max) {
        this.max = max;
        this.list = new ArrayList<Files>(max);
    }

    public ArrayList<Files> getList() {
        return list;
    }

    public void setList(ArrayList<Files> list) {
        this.list = list;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void addFiles (Files files) {
        if (list.contains(files)){
            list.remove(files);
        } else if (list.size() == max) {
            list.remove(15);
        }
        list.add(0, files);
    }


}
