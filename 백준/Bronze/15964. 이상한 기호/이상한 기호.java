import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numA = sc.nextLong();
        long numB = sc.nextLong();
        sc.close();
        
        System.out.println(calculator(numA, numB));
    }
    
    public static long calculator(long numA, long numB) {
        long result = (numA + numB) * (numA - numB);
        return result;
    }
}