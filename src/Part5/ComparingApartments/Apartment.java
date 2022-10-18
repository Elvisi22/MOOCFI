package Part5.ComparingApartments;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms , int squares , int pricePerSquare ){
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared){
        int priceDiff = 0;
        priceDiff = Math.abs((compared.pricePerSquare*compared.squares)-(this.pricePerSquare*this.squares));
        return priceDiff;
    }

    public boolean moreExpensiveThan(Apartment compared){
        int ownApt = this.squares*this.pricePerSquare;
        int apt = compared.squares*compared.pricePerSquare;
        if(ownApt > apt){
            return true;
        }
        return false;
    }
}
