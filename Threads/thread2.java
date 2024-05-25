package Threads;
//Race condition threads
class counter{
    int count;
    public synchronized void count(){
count++;
    }
}

public class thread2 {
    public static void main(String[] args) throws InterruptedException{
      counter c = new counter();
    Runnable obj1 =() -> {
        for(int i=1;i<=1000;i++){
            c.count();
        }
    };

    Runnable obj2 = ()->{
        for(int i=1;i<=1000;i++){
            c.count();
        }
    };
    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println(c.count);
}
}