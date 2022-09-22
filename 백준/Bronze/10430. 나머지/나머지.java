import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A = 0;
        int B = 0;
        int C = 0;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();

        input.close();

        System.out.println( (A+B)%C );
        System.out.println( (A%C + B%C)%C );
        System.out.println( (A*B)%C );
        System.out.println( (A%C * B%C)%C );
    }
}
