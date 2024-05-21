class A{
    public void show(){
        System.out.println("In A");
    }
}

abstract class B{
    public abstract void show1();
        
}

public class anonymousInnerClass {
    public static void main(String args[]){
 A obj =  new A(){
    public void show(){ //this is anonymous inner class because it is defined inside an object with no class name
        System.out.println("Inner class"); 
    }
 };

obj.show();

 //Calling abstract method on inner anonymous class.
B obj1 =  new B(){
    public void show1(){
        System.out.println("In abstract class");
    }
};
obj1.show1();
    }
}
