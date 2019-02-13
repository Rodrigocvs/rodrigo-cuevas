import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

public class TestBlog {

    private Blogi blogi;
    private ListBlog listblog;

    @Before
    public void start() {
        listblog = new ListBlog();
        blogi = mock(Blogi.class);
        ArrayList<Blog> blogs = new ArrayList<>();

        blogs.add(new Blog("Page 1" ,"topic2.com"));
        blogs.add(new Blog("Page 2" ,"topic2.com"));
        blogs.add(new Blog("Page 3" ,"topic2.com"));
        blogs.add(new Blog("Page 4" ,"topic2.com"));
        when(blogi.RecentEntries().thenReturns(blogs));
    }

    @Test
    public void addNew(){
        listblog.addBlog(blogi.RecentEntries().get(0));

        Assert.assertTrue(listblog.containBlog(blogi.RecentEntries().get(0)));
    }

    @Test
    public void deteteBlog(){
        for (int i = 0; i <3 ; i++) {
            listblog.addBlog(blogi.RecentEntries().get(i));
        }
        listblog.deteleBlog(new Blog("Topic2" , "topic2.com"));
    }

    @Test
    public void show10Blog(){
        for (int i = 0; i < 3; i++) {

            listblog.addBlog(blogi.RecentEntries().get(i));
        }
        for (int i = 0; i < listblog.getBlog().size(); i++) {
            Assert.assertFalse(listblog.getBlog(i).getDate().isBefore(listblog.getBlog(i++).getDate()));

        }
    }

}
