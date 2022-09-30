import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number  = input.nextInt();
        input.close();

        for (int loop = 1; loop <= number; loop++)
            System.out.printf("%d\n", loop);
    }
}
