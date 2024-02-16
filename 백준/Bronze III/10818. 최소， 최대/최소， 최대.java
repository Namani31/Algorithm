import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        
        // 정수의 개수 N 입력 받기
        int testCase = Integer.parseInt(buffer.readLine());
        
        // N개의 정수 입력 받기
        StringTokenizer stringToken = new StringTokenizer(buffer.readLine());
        int[] numbers = new int[testCase];
        for (int index = 0; index < testCase; index++) {
            numbers[index] = Integer.parseInt(stringToken.nextToken());
        }
        
        // 최소값, 최대값 출력
        System.out.println(findMin(numbers));
        System.out.println(findMax(numbers));
    }
    
    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for(int index = 1; index < numbers.length; index++) {
            if(numbers[index] < min) {
                min = numbers[index];
            }
        }
        return min;
    }
    
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for(int index = 1; index < numbers.length; index++) {
            if(numbers[index] > max) {
                max = numbers[index];
            }
        }
        return max;
    }
}