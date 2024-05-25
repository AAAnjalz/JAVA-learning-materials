import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorString {
    public static void main(String[] args){
        Comparator <String> com = (String i , String j)->
           {
            return i.length() > j.length() ? 1 : -1; //Returning 1 swaps value and returning -1 does not. As we are sorting in ascending order, if i is greater than j then they should
            //be swapped otherwise they should remain the same.
           };

        List<String> name = new ArrayList<>();
        name.add("Anjal");
        name.add("Dnjalad");
        name.add("Snjala");
        name.add("Bnjalasdasq");

        Collections.sort(name, com);

        System.out.println(name);
    }
}
