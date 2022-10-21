package Part5.Money;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition){
       int newEuros = addition.euros() + this.euros;
       int newCents = addition.cents + this.cents;
       return new Money(newEuros , newCents);

    }
    public boolean lessThan(Money compared){
        double thisTotal = this.euros + this.cents;
        double comparedTOTAL = compared.euros() + compared.cents;
        return thisTotal < comparedTOTAL;
    }

    public Money minus(Money decreaser){
        int newEuros = this.euros - decreaser.euros();
        int newCents = this.cents - decreaser.cents();

        if(newCents < 0){
            newCents += 100;
            newEuros -= 1;
        }

        if(newEuros < 0){
            return new Money(0,0);
        }else{
            return new Money(newEuros , newCents);
        }

    }
}
