import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lNumber = 0;
        int rNumber = 0;

        Scanner input = new Scanner(System.in);
        lNumber = input.nextInt();
        rNumber = input.nextInt();

        System.out.println(lNumber - rNumber);

        input.close();
    }
}
