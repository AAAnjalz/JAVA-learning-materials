interface A{
    int age = 18;
    String name = "Anjal";
    void show(); //These methods are by default abstract and public as they are defined inside the interface method
    void config();
}

interface X{
    void show1();
}



class B implements A,X{ //calling multiple interface
public void show(){
System.out.println("Show method");
}
public void config(){
    
System.out.println("Config method");
}

public void show1(){
    System.out.println("Show1 method");
}
}



public class interFace1 {
    public static void main(String args[]){
A obj = new B(); //B can be called instead to A
obj.show();
obj.config();

X obj1 = new B(); //B can be called instead to X
obj1.show1();

    }
}
