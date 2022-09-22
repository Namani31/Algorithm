import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName = null;

        Scanner input = new Scanner(System.in);

        // nextLine: 문자열 입력
        userName = input.nextLine();
        input.close();

        System.out.println(userName+"??!");

    }
}
