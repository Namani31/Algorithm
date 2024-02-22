import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(buffer.readLine());
        int B = Integer.parseInt(buffer.readLine());
        int C = Integer.parseInt(buffer.readLine());
        int[] count = new int[10];
        String result = Integer.toString(A * B * C);
        
        for (int num = 0; num < result.length(); num++) {
            count[Character.getNumericValue(result.charAt(num))]++;
        }
        for (int index = 0; index < 10; index++) {
            System.out.println(count[index]);
        }
    }
}