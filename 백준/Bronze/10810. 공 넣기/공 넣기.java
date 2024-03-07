import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] basket = new int[N];
        
        for(int inputData = 0; inputData < M; inputData++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            
            for(int inputBall = i - 1; inputBall < j; inputBall++) {
                basket[inputBall] = k;
            }
        }
        for(int printData = 0; printData < N; printData++) {
            System.out.print(basket[printData] + " ");
        }
        scanner.close();
    }
}