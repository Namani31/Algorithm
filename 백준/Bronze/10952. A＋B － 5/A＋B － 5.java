import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numA = 0;
        int numB = 0;

        while (scanner.hasNext()) {
            numA = scanner.nextInt();
            numB = scanner.nextInt();
            
            if (numA > 0 && numB < 10) {
                System.out.println(numA + numB);
            } else if (numA == 0 && numB == 0) {
                break;
            }
        }
    }
}