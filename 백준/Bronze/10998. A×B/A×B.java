import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int LNum = 0;
        int RNum = 0;

        Scanner ipt = new Scanner(System.in);

        LNum = ipt.nextInt();
        RNum = ipt.nextInt();

        System.out.println(LNum * RNum);

        ipt.close();
    }
}