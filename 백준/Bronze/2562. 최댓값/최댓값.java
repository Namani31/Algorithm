import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[9];
        int max = 0;
        int index = 0;
        
        for (int loop = 0; loop < arr.length; loop++) {
            arr[loop] = Integer.parseInt(buffer.readLine());
            if (arr[loop] > max) {
                max = arr[loop];
                index = loop + 1; // 배열 안의 index는 0부터 시작인데 몇 번째 수인지 구해야하므로 +1
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}