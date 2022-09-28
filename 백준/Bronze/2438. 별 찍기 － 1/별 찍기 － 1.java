import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int rowLoop = 1; rowLoop <= num; rowLoop++) {
            for (int colLoop = 1; colLoop <= rowLoop; colLoop++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
