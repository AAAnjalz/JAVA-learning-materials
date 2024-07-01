sealed class A permits B,C{

}
final class B extends A{ //class extending seal class should specify its type either final sealed or non-sealed

}
final class C extends A{

}
class D{

}

public class sealedClass {
public static void main(String[] args) {
    
}    
}
