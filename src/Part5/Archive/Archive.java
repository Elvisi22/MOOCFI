package Part5.Archive;

public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier , String name){
        this.identifier = identifier;
        this.name = name;
    }
    public String toString(){
        return this.identifier +": " + this.name;
    }
    public boolean equals(Object compared){
        Archive archive = (Archive) compared;
        return this.name.equals(archive.name)&&
                this.identifier.equals(archive.identifier);
    }
}
