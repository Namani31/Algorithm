import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 문제를 잘 읽어보면 10의 1000제곱 이라는 제한이 있음, Int로 X, Long도 X
        // BigInteger는 문자열로 되어있으므로 문자열을 인자 값으로 넘겨줘야 함
        Scanner someMoney = new Scanner(System.in);

        BigInteger beakMoney = someMoney.nextBigInteger();
        BigInteger giveMoney = someMoney.nextBigInteger();

        someMoney.close();

        System.out.println(beakMoney.divide(giveMoney));
        System.out.println(beakMoney.remainder(giveMoney));
    }
}
