import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 두 수를 곱한 값과 첫 번째 수에 두 번째 수를 한 자리씩 분리하여 곱한 결과 구해야 함
        // 472, 385
        int firstNumber = 0;
        int secondNumber = 0;

        Scanner input = new Scanner(System.in);

        firstNumber = input.nextInt();
        secondNumber = input.nextInt();

        input.close();

        // 두 번째 수를 한 자리씩 분리해야 함, 먼저 1의 자리
        System.out.println(firstNumber * (secondNumber % 10));
        /*
            두 번째 수의 100의 자리만 따로 분리해야 함
            (472 * (385 % 100 / 10)
            385 % 100 = 85
            85 / 10 = 8
         */
        System.out.println(firstNumber * (secondNumber % 100 / 10));
        System.out.println(firstNumber * (secondNumber / 100));
        System.out.print(firstNumber * secondNumber);
    }
}
