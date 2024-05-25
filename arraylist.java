import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class arraylist {
    public static void main(String[] args){
        List<Integer> num = new ArrayList<Integer>();
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        // System.out.println(num.indexOf(4));
        // System.out.println(num.get(3));
        
        // for(int n: num){
        //     System.out.println(n);
        // }

       for(Object n : num){
        int number = (Integer) n;
        System.out.println(number);
       }

       
    }
}

//List supports index value and stores data in object
//Collection does not support index value and stores data in given format
