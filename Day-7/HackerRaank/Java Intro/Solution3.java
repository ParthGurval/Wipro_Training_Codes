import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String res; 
        
        int N = sc.nextInt();
        
        if(N % 2 == 0){
            
            if(( N >= 2 && N <= 5 ) || N > 20){
                System.out.println("Not Weird");
            }
            else{
                System.out.println("Weird");
            }
        }
        
        else{
            System.out.println("Weird");
        }
        
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        sc.close();
    }
}
