import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] numArr = new int[N];

        for (int addNum = 0; addNum < N; addNum++) {
            numArr[addNum] = scanner.nextInt();
        }

        int v = scanner.nextInt();
        int cnt = 0;

        for (int compare = 0; compare < N; compare++) {
            if (v == numArr[compare]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}