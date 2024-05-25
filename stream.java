//Stream can only be used once for one method.
//Stream provides alot of methods.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,5,3,4,6,7);
        
// Stream<Integer> s1 = nums.stream();
// Stream<Integer> s2 = s1.filter(n-> n%2==0);
// Stream<Integer> s3 = s2.map(n-> n*2);
//  int results = s3.reduce(0,(c,e)-> c+e);

// System.out.println(results);

//These two are same.
    

 int results = nums.stream().filter(n-> n%2==0).map(n->n*2).reduce(0, (c,e) -> c+e);
 System.out.println(results);


        
        // nums.forEach(n -> System.out.println(n));


        // int sum = 0;
        // for(int n : nums ){
        //      if(n%2 == 0){
        //         n=n*2;
        //         sum=sum+n;
        //      }
        // }
        // System.out.println(sum);
    }
}

