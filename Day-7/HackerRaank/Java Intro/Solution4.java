
// Java Stdin and Stdout II

//Input Format

//There are three lines of input:

//The first line contains an integer.
//The second line contains a double.
//The third line contains a String.
//Output Format

//There are three lines of output:

//On the first line, print String: followed by the unaltered String read from stdin.
//On the second line, print Double: followed by the unaltered double read from stdin.
//On the third line, print Int: followed by the unaltered integer read from stdin.

import java.util.Scanner;

public class Solution4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        double d = sc.nextDouble();
        sc.nextLine();
        
        String s = sc.nextLine();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        sc.close();
    }
}