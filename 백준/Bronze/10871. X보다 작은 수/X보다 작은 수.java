import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] numArr = new int[N];

        for (int loop = 0; loop < N; loop++) {
            numArr[loop] = scanner.nextInt();
            
            if (numArr[loop] < X) {
                System.out.println(numArr[loop]);
            }
        }
    }
}