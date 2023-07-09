import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int numA = 0;
        int numB = 0;

        for (int numInput = 0; numInput < count; numInput++) {
            numA = scanner.nextInt();
            numB = scanner.nextInt();

            System.out.println(numA + numB);
        }
    }
}