public class VarClass {
    public static void main(String[] args) {
        // var a = 10;
        // var b = "Excellent";
        // System.out.println(a + ":" + b);
        // var c; //This is invaid because you have to initialize value in var\

var array = new int[10];//Initializing array in var
array[0] = 10;
array[1] = 20;
array[2] = 30;
for(var i : array){
    System.out.println(i);
} 
        

    }
}
