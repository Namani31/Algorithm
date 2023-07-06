import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int user_Num = scanner.nextInt();
        scanner.close();

        int fact_Sum = factorial(user_Num);
        System.out.println(fact_Sum);
    }

    public static int factorial (int fact_Num) {
        if (fact_Num <= 1) {
            return 1;
        } else {
            return fact_Num * factorial(fact_Num - 1);
        }
    }
}