package Part5.Book;

public class Book {
    private String author;
    private String title;
    private Integer pages;


    public Book(String author , String title , Integer pages){
        this.author = author;
        this.title = title;
        this.pages = pages;

    }

    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public Integer getPages(){
        return pages;
    }

    public String toString(){
        return this.author + " , " + this.title + " , " + this.pages + " pages";
    }
}
