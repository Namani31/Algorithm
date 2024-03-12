import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        for(int row = 0; row < N; row++) {
            for(int space = 0; space < row; space++) {
                System.out.print(" ");
            }
            
            for(int column = N; column > row; column--) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}