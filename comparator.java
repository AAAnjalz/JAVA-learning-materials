import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparator {
    public static void main(String[] args){
//         List<Integer> nums =  new ArrayList<>();
// nums.add(4);
// nums.add(2);
// nums.add(8);
// nums.add(6);

// Collections.sort(nums);//this is comparable operator. It is the default way of sorting values
// System.out.println(nums);

Comparator<Integer> com = new Comparator<Integer>()
{
public int compare(Integer i, Integer j)
{
if(i%10 > j%10){
    return 1; //If you return 1 it will swap
}else{
    return -1;//If you return -1 it will not swap
}
}
};

List<Integer> num1 =  new ArrayList<>();
num1.add(42);
num1.add(27);
num1.add(84);
num1.add(68);

Collections.sort(num1,com);

System.out.println(num1);
    }
}
