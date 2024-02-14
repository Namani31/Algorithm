import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        
        System.out.println(calculator(numA, numB));
    }
    
    public static int calculator(int numA, int numB) {
        int result = (numA + numB) * (numA - numB);
        return result;
    }
}