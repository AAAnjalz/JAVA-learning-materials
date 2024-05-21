//Method 1 of encapsulation
class Human{
   private int age;
   private String name;

   public int getAge(){
      return age;
         }
   
   public void setAge(int a){
    age = a;
   }

   public String getName(){
      return name;
     }

public void setName(String b){
    name = b;
}
}



public class encapsulation {
 public static void main(String[] args){
Human obj = new Human();
obj.setAge(10);
obj.setName("Anzuuu");
System.out.println(obj.getName() + " " + obj.getAge()); //Method 1
}   
}
