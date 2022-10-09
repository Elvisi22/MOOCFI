package Part4.Product;

public class Product {
    private double price;
    private int quantity;
    private String name;

    public Product(String name , Double price , Integer quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void printProduct(){
        System.out.println(this.name + " , price " + this.price + " , " +
                this.quantity + " pcs");
    }
}
