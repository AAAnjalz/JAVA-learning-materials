record Alien(int age, String name){

public Alien(){
    this(0,"");
}
}

public class recordClass{ //This method by default implements toString and equals method.It is used to record datas
    public static void main(String[] args) {
    Alien obj =  new Alien(1, "Anzuuu");
    Alien obj1 = new Alien(1, "Anzuuu");
    Alien obj2 = new Alien();

    // System.out.println(obj);
    // System.out.println(obj.equals(obj1));
    System.out.println(obj2);
    }
}