import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        for(int row = 1; row <= N; row++) {
            for(int column = 1; column <= N-row; column++) {
                System.out.print(" ");
            }
            for(int star = 0; star < row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}