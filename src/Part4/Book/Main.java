package Part4.Book;

public class Main {
    private String name;
    private Integer pages;
    private Integer year;

    public Main(String name, Integer pages, Integer year) {
        this.name = name;
        this.pages = pages;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Integer getPages() {
        return pages;
    }

    public Integer getYear() {
        return year;
    }


    public String toString() {
        return this.name + " " + this.pages + " pages" + this.year;
    }
}
