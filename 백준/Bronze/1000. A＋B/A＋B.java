import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A = 0;
        int B = 0;
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        B = input.nextInt();

        System.out.println(A + B);
        
        input.close();
    }
}