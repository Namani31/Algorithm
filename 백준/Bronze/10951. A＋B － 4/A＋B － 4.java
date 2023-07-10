import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numA = 0;
        int numB = 0;

        while (scanner.hasNextInt()) {
            numA = scanner.nextInt();
            numB = scanner.nextInt();

            System.out.println(numA + numB);
        }
    }
}