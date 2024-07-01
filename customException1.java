class AnjalException extends Exception{
    public AnjalException(String string){
super(string);
    }
}

public class customException1 {
    public static void main(String[] args){
        int i=0;
        int j = 0;
        try{
            j=18/i;
            
            if(j == 0){
                throw new AnjalException("Default value is 18");
            }
        }catch(AnjalException e){
            j=18;
            System.out.println("This is the default value " + e);
        }catch(Exception e){
            System.out.println("An error has occured");
        }
        System.out.println(j);
    
    }
}
