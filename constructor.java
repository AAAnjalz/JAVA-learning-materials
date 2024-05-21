class Footballer{
    private int trophy;
    private String name;

    public int getTrophy(){
        return trophy;
    }

    public Footballer(){ //this is default constructor and contains default value
        trophy = 33;
        name="Messi";
    }

    public Footballer(int trophy , String name){ //this is parameterized constructor
this.trophy = trophy;
this.name = name;
    }

    public void setTrophy(int trophy ){
this.trophy = trophy;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}


public class constructor {
    public static void main(String[] args){
        Footballer obj = new Footballer();//default constructor
        System.out.println(obj.getName() + " has " + obj.getTrophy() +" trophies");
      

        Footballer obj1 = new Footballer(38,"Messi"); // parameterized constructor
        System.out.println(obj1.getName() + " has " + obj1.getTrophy() +" trophies");

    
        

    }
}
