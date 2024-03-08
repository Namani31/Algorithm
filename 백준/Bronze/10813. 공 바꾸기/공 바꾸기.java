import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();    // 바구니 개수
        int M = scanner.nextInt();    // 교환 방법
        int[] basket = new int[N];
        int temp = 0;    // swap용 임시 공간
        
        // 바구니마다 1~N까지 값 넣기
        for(int init = 0; init < basket.length; init++) {
            basket[init] = init + 1 ;
        }
        
        for(int inputData = 0; inputData < M; inputData++) {
            int i = scanner.nextInt();    // 공 교환 시작 위치
            int j = scanner.nextInt();    // 공 교환 끝 위치
           
            temp = basket[i - 1];
            basket[i - 1] = basket[j - 1];
            basket[j - 1] = temp;
        }
        for(int printNum = 0; printNum < basket.length; printNum++) {
            System.out.print(basket[printNum] + " ");
        }
        scanner.close();
    }
}