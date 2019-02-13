import org.junit.Assert;
import org.junit.Test;
import java.util.Date;

public class FilesTest {

    java.util.Date today = new java.util.Date();

    @Test
    public void FirstTime() {
        RecentsFiles list = new RecentsFiles(15) ;
        Assert.assertTrue(list.getList().isEmpty());
    }

    @Test
    public void addNewFile () {
        RecentsFiles list = new RecentsFiles(15);
        Files files = new Files ("Test" , 11 , "User" , today );
        list.addFiles(files);

        Assert.assertTrue(list.getList().contains(files));
    }

    @Test
    public void AddwhithMax(){
        RecentsFiles list = new RecentsFiles(3);
        Files file1 = new Files("File1",123,"User/WWW" , today);
        Files file2 = new Files("File2",154,"User/WWW" , today);
        Files file3 = new Files("File3",100,"User/ttt" , today);
        Files file4 = new Files("File4",154,"User/WWW" , today);


        list.addFiles(file1);
        list.addFiles(file2);
        list.addFiles(file3);
        list.addFiles(file4);





        Files newFile = list.getList().get(0);
        Files oldFile = list.getList().get(list.getList().size()-1);

        Assert.assertEquals(file4, newFile);
        Assert.assertEquals(file2, oldFile);
    }

    @Test
    public void DuplicateFiles() {
        RecentsFiles list = new RecentsFiles(15);
        Files file1 = new Files("Test1" ,12 ,"User/Rodrigo" , today);
        Files file2 = new Files("Test2" ,131 ,"User/Carla" , today);
        Files file3 = new Files("Test3" ,111 ,"User/Lucas" , today);
        list.addFiles(file1);
        list.addFiles(file2);
        list.addFiles(file3);
        list.addFiles(file3);

        Files lastFile = list.getList().get(0);

        Assert.assertEquals(file3,lastFile);
    }


}
