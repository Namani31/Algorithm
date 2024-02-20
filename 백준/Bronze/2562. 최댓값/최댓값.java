import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int index = 0;
        
        for (int loop = 0; loop < 9; loop++) {
            int value = Integer.parseInt(buffer.readLine());
            
            if (value > max) {
                max = value;
                index = loop + 1; // 배열 안의 index는 0부터 시작인데 몇 번째 수인지 구해야하므로 +1
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}