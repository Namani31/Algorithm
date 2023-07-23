import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();
        BigInteger plus = A.add(B);
        BigInteger minus = A.subtract(B);
        BigInteger multiple = A.multiply(B);

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiple);
    }
}