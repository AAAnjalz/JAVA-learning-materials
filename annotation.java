@FunctionalInterface//This annotation makes sure that there is only one method in the interface as it is functional interface, it throws error if we define more than one method.
interface C{
void functionalInterface(); //Interface which has only one method is functional interface 
}

class A{
  public void show(){
    System.out.println("Show 1");
  }
}
class B extends A{
    @Override // THis annotation defines that we want to over ride a method and it shows an error if the method is not over ridden.
    public void show(){
        System.out.println("Show 2");
      }
    }


public class annotation {
    public static void main(String[] args){
B obj =  new B();
obj.show();
    }
}
