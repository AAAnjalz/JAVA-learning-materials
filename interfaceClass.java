interface Computer{
   public abstract void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Coding compiling running");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Coding compiling running: faster");
    }
}

class Developer{
    public void appDev(Computer startCoding){
        startCoding.code();
    }

}



public class interfaceClass{
public static void main(String[] args){
    Laptop lap= new Laptop();
    Desktop desk = new Desktop();

    Developer anjal =  new Developer();
    anjal.appDev(desk);


}
}