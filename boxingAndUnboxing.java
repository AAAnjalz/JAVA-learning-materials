public class boxingAndUnboxing {
    public static void main(String[] args){
       int num = 7;
       Integer num1 = new Integer(num); //this is boxing
       System.out.println("boxing " + num1);

       Integer num2 = num; // this is autoboxing
       System.out.println("autoboxing " + num2);

       int num3 = num2.intValue();
       System.out.println("unboxing " + num3); //this is unboxing

       int num4 = num2;
       System.out.println("auto-unboxing " + num4); // this is auto- unboxing

       String number = "12";
       int number1 = Integer.parseInt(number);
       System.out.println(number1);



    
    }
}
