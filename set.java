//Set is collection of unique values, it does not print any duplicate elements. HashSet does not print value in sequence bur Tree set does.


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;



public class set {
    public static void main(String[] args){
        Set<Integer> nums =  new HashSet<Integer>(); //This does not print number in sequence.
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(40);

        
        for(int n : nums){
System.out.println(n);
        }

        System.out.println("  ");

        Set<Integer> nums1 = new TreeSet<Integer>(); //This prints number is sequence
        nums1.add(10);
        nums1.add(20);
        nums1.add(30);
        nums1.add(40);
     
   Iterator <Integer> values = nums1.iterator(); //another method of printing 
   while(values.hasNext()){
    System.out.println(values.next());
   } 
     
System.out.println(" ");

        for(int n:nums1){
            System.out.println(n);
        }
    }
}
