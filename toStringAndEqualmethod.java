class Computer{
    int price;
    String model;

    public boolean equals(Computer that){
if(this.price == that.price && this.model.equals(that.model))
    return true;
else
return false;

    }


}

public class toStringAndEqualmethod{
    public static void main(String[] args){
Computer obj =  new Computer();
obj.price = 1000;
obj.model = "XYZ";

Computer obj1 =  new Computer();
obj1.price = 1000;
obj1.model = "XYZ";

boolean result = obj.equals(obj1);
System.out.println(result);
    }
}