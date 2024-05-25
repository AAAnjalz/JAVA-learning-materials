class A extends Thread { //extending thread method.
   public void run() //run is mandatory keyword to run thread
   { 
      for(int i=1;i<=10;i++){
         System.out.println("Hi");
       
         try{
            Thread.sleep(10); //this method puts thread to sleep and gives sometime for next code to execute. It throws an exception , hence it should be wrapped in a try catch block
         }catch(InterruptedException e){
e.printStackTrace();
         }
      }
   }
}

class B extends Thread {//extending thread method.
   public void run()//run is mandatory keyword to run thread
   { 
      for(int i=1 ; i<=10; i++){
         System.out.println("Hello");
         try{
            Thread.sleep(10); //this method puts thread to sleep and gives sometime for next code to execute. It throws an exception , hence it should be wrapped in a try catch block
         }catch(InterruptedException e){
e.printStackTrace();
         }
      }
   }
}

public class Threads {
   public static void main(String[] args){
A obj1 = new A();
B obj2 =  new B();
//here we are trying to print hi and hello one after other
obj1.start();
obj2.start(); //Start is the method that is pre defined in java to start thread.
// obj2.setPriority(1);// This sets priority of threads. 1= lowest, 10= highest

   } 
}
