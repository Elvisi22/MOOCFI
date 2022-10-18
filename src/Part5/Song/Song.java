package Part5.Song;

public class Song {
   private String song;
   private String artist;
   private int year;

   public Song(String song , String artist , int year){
       this.song = song;
       this.artist= artist;
       this.year = year;
   }

   public boolean equals(Song compared){
       // if the variables are located in the same position, they are equal
       if(this == compared){
           return true;
       }
       // if the compared object is not of type Person, the objects are not equal
       if(!(compared instanceof  Song)){
           return false;
       }
       // convert the object into a Person object
       Song comparedSong = (Song) compared;

       // if the values of the object variables are equal, the objects are equal
       if(this.song.equals(comparedSong.song) &&
       this.artist.equals(comparedSong.artist)
       && this.year == comparedSong.year){
           return true;
       }
       return false;
   }

}
