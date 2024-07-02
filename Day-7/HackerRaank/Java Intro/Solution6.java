
//Multiplication Table code

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution6 {
    public static void main(String[] args){
       
       Scanner sc = new Scanner(System.in);
       
       int num = sc.nextInt();
       
       for(int i = 1; i <= 10; i++){
           
           System.out.println(num+ " x " + i + " = " + num * i);
       }
       
       sc.close();
    }
}
