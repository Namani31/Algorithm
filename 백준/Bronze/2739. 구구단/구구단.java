import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNum = 0;

        Scanner input = new Scanner(System.in);

        firstNum = input.nextInt();

        input.close();

        for (int loop = 1; loop <= 9; loop++) {
            System.out.printf("%d * %d = %d\n", firstNum, loop, firstNum * loop);
        }

    }
}
