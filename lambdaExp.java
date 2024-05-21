// "->" this method is called lambda expression.

interface A{
  int add(int i, int j);
}

public class lambdaExp {
    public static void main(String args[]){
A obj = (i,j) -> i+j;  //This code is reduced using lambda expression.
int a = obj.add(5, 5);
System.out.println(a);

// The code written below and above are the same. The below one is written without lambda expression whereas upper one is written using lambda expression.

// A obj =  new A() {
//     public int add(int i, int j){
//         return i+j;
//     }
// };
// int a =  obj.add(5, 5);
// System.out.println(a);
    }
}
