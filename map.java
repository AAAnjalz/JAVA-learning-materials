//IMP- Keys cannot be repeated but values can be.

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class map {
    public static void main(String[] args){
        Map<String, Integer> students = new TreeMap<>(); //Tree gives data in sequence while Hash gives data in random order
        students.put("Anjal", 10);
        students.put("Anjali", 20);
        students.put("Anzuuu", 30);
        students.put("Anvar", 40);

        System.out.println(students); //printing all values
        System.out.println(students.get("Anzuuu"));//Printing only one data with get method and key.

//         for(String key : students.keySet()){
// System.out.println(key + " : " + students.get(key));
//         }

    }
}
