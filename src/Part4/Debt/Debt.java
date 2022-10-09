package Part4.Debt;

public class Debt {
    private double balance;
    private double interestRate;

    public Debt(Double balance , Double interestRate){
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void printBalance(){
        System.out.println(this.balance);
    }

    public void waitOneYear(){
        this.balance = this.balance*interestRate;

    }
}
