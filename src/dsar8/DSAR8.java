package dsar8;
import java.util.*;
public class DSAR8 {
    public static int fib(int n){
        if(n<2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
public static void main(String[] args) {
    //Using Recursion.
    int n;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter an integer\t");
    n=in.nextInt();
System.out.println("Fibonacii Series\t"+fib(n));
    }   
}