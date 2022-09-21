import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Lnum = 0;
        double Rnum = 0;

        Scanner input = new Scanner(System.in);

        Lnum = input.nextDouble();
        Rnum = input.nextDouble();

        System.out.println(Lnum / Rnum);

        input.close();
    }
}
