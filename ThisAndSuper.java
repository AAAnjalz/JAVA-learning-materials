class A{
public A(){
    super();
    System.out.println("In A");
}
public A(int a){
super();
    System.out.println("in a int");
}
}
class B extends A{
public B(){
    super();
    System.out.println("In B");
}

public B(int n){
    this();
System.out.println("in b int");
}
}

public class ThisAndSuper {
    public static void main(String[] args){
B obj =  new B(5);
    }
}
