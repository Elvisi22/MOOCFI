package Part4.Film;

public class Film {
    private String name;
    private Integer ageRating;

    public Film(String name , Integer ageRating){
        this.name = name;
        this.ageRating = ageRating;
    }

    public String name(){
        return this.name;
    }
    public Integer ageRating(){
        return this.ageRating;
    }
}
