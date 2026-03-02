package statictest;

import java.util.function.DoubleToIntFunction;

public class test {
    public static void main(String[] args) {
        movie m1 = new movie("hello","leon");
    }
}

class movie{
    private String title;
    private String director;

    {
        System.out.println("<UNK>");

    }
    //代码块优先于构造函数运行
    public movie(String title, String director) {
        this.title = title;
        this.director = director;
        System.out.println("start");
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}