import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int LNum = 0;
        int RNum = 0;

        Scanner input = new Scanner(System.in);

        LNum = input.nextInt();
        RNum = input.nextInt();

        System.out.println(LNum + RNum);
        System.out.println(LNum - RNum);
        System.out.println(LNum * RNum);
        System.out.println(LNum / RNum);
        System.out.print(LNum % RNum);
    }
}
