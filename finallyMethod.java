import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class finallyMethod {
    public static void main(String[] args) throws NumberFormatException, IOException{
int num = 0;
        try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){ //this is auto closeable
            System.out.println("Enter number");
           num = Integer.parseInt(br.readLine());
        }
    
     

    }
}
