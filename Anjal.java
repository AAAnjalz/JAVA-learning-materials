//if number is divisible by 5 - fizz
//if number is divisible by 3 - buzz
//if number is divisible by both 5 and 3- fizzbuzz;
//if not divisible by any - return same number



public class Anjal {
    public static void main(String[] args){

int nums[][] = new int[3][];
nums[0] = new int[3];
nums[1] = new int[2];
nums[2] = new int[1];

for(int i=0;i<nums.length;i++){

    for(int j=0; j<nums[i].length;j++){

        nums[i][j] = (int) (Math.random()*10);
    }
    
} 
//This loop iterated through each array and assigns value

for(int n[]: nums){
for(int m:n){
    System.out.print(m + " ");
}
System.out.println(); //This helps printing array in different line.
}
//This code prints the array 




}}


