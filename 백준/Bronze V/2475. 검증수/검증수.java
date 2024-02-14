import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        
        for(int index = 0; index < 5; index++) {
            int num = sc.nextInt();
            result += num*num;
            }
        System.out.println(result % 10);
    }
}