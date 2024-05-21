abstract class Car
{ //Abstract class
    
    abstract public void drive();

    public void playMusic(){
        System.out.println("Playing music");
    }
}

class Mustang extends Car{ //Concrete class
    public void drive(){
        System.out.println("Driving Mustang...");
    }
}

public class abstractClass {
    public static void main(String[] args){
        Car obj =  new Mustang();
        obj.playMusic();
        obj.drive();
    }
}
