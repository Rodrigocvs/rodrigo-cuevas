import java.util.ArrayList;
import java.util.List;

public class ListBlog {



    private List<Blog> blog;

    public  ListBlog() {
        this.blog = new ArrayList<>();
    }

    public List<Blog> getBlog() {
        return  blog;
    }

    public void setBlog(List<Blog> blog) {
        this.blog = blog;
    }

    public Blog getBlog(int index) {
        return blog.get(index);
    }

    public void addBlog(Blog blog) {
        if (blog.contains(blog)){
            blog.remove(blog);
        }
            blog.add(0,blog);
    }

    public void showLastBlog() {
        for (int i = 0; i < blog.size(); i++) {
            System.out.println(blog.get(i));
        }
    }

    public boolean containBlog(Blog blog) {
        return blog.contains(blog);
    }

    public boolean deteleBlog (Blog blog) {
        return blog.remove(blog);
    }
}
