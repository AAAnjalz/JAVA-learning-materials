class A{
    public void show(){
        System.out.println("Show A");
    }
    class B{ //this is inner class as it is defined inside A.
        public void config(){
            System.out.println("Show B");
        }
    }
static class C
{ //This is also an inner class that if defined as static class and can be called directly without using obj of A
    
    public void config1(){
        System.out.println("Show C");
    }
}
}

public class innerClass {
    public static void main(String[] args){
       A obj  = new A();
       obj.show();

       A.B obj1 =  obj.new B(); //This is how you call an inner class that is non static.Method 1.
       obj1.config();

       A.C obj2 = new A.C(); // This is how you call an inner class that in static. Method 2.
     obj2.config1();


    }
}
