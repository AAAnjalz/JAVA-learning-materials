import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class scannerof {
    public static void main(String[] args) throws IOException{
        // Buffer method
        System.out.println("Enter a number");

        InputStreamReader in =  new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine()); //converting it into integer
        
        System.out.println(num);
         bf.close();

         //Scanner method
         System.out.println("Enter a number");
         Scanner scan = new Scanner(System.in);
         int num1 = scan.nextInt();
         System.out.println(num1);
         scan.close();
     
        }
}
