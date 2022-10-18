package Part5.Books;

public class Book {
    private String name;

    private Integer year;

    public Book(String name, Integer year) {
        this.name = name;

        this.year = year;
    }

    public String getName() {
        return name;
    }



    public Integer getYear() {
        return year;
    }


    public String toString() {
        return this.name + " " +  " pages" + this.year;
    }

    public boolean equals(Object compared){

        Book comparedBook = (Book) compared;

        return this.name.equals(comparedBook.name);
    }
}
