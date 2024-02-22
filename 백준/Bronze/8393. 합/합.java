import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int result = 0;
        
        for(int index = 1; index <= n; index++) {
            result += index;
        }
        System.out.println(result);
    }
}