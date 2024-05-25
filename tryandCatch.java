
public class tryandCatch {
    public static void main(String args[]){
int i = 18;
int j = 0;
int nums[] =  new int[5];
String name = null;


try{ 
    j =  i/0; //This will give infinite value which is an error
    System.out.println(nums[1]);
    // System.out.println(nums[5]);//throws error
    System.out.println(name.length());//throws error

}catch(ArrayIndexOutOfBoundsException e){ //Catch block for array
    System.out.println("Array out of bounds " ) ;
}catch(ArithmeticException e){ //Catch block for arithmetic expression
    System.out.println("Cannot divide number by 0");
}catch(Exception e){//Catch block for unknown error
    System.out.println("An error has occured");
}

System.out.println(j);

// System.out.println("Code compiled");
    }
}
