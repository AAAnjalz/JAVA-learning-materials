class AnjalException extends Exception{
    public AnjalException(String string){
super(string);
    }
}

public class customException {
    public static void main(String[] args){
   int i = 2;
   int j = 0;
   try{
    j = 18/i;

    if(j==0)
    throw new AnjalException("Cant print 0 as output"); //as the value of j comes 0 it throws custom error
    
   }catch(AnjalException e){ //this code catches the error that is custom defined above
    j=18;
    System.out.println("That is the default output " + e);
   }catch(Exception e){
    System.out.println("Something went wrong");
   }
   System.out.println(j);
    }
}
