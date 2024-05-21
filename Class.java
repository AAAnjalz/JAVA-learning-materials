class Computer{
    public void playMusic(){
        System.out.println("Play music");
    }
    public String getMeAPen(int cost){
        if(cost >=10)
            return "Take this pen";
        
        return "Not enough cost";
    }
}



public class Class{
    public static void main(String[] args){
        System.out.println("Hi");
        Computer obj = new Computer();
        obj.playMusic();
String pen  = obj.getMeAPen(1);
System.out.println(pen);
    }

    public static void forName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'forName'");
    }
}