enum Laptop{
    Predator(2800), XPS(2500), Dell(), Nitro(1800);

    private int price;

    private Laptop(){ //default constructor

        price = 1000;
    }

    private Laptop(int price){
       this.price = price; // helps set price for above defined laptops
    }

    public int getPrice(){
        return price; //returns price of laptops
    }

    public void setPrice(int price){
        this.price = price;
    }

}
public class enumClass1{
    public static void main(String[] args){
        // Laptop lap1 = Laptop.Dell;
        // System.out.println(lap1.getPrice());

        for(Laptop lap : Laptop.values()){
            System.out.println(lap +" : " + lap.getPrice()); //using enhanced for loop to get price and model of all laptops
        }
    }
}