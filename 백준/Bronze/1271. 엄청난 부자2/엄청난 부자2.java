import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger assistantMoney = sc.nextBigInteger();
        BigInteger getPaid = sc.nextBigInteger();

        System.out.println(assistantMoney.divide(getPaid));
        System.out.print(assistantMoney.remainder(getPaid));
    }
}