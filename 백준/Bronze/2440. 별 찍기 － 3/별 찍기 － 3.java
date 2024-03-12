import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        for(int row = 1; row <= N; row++) {
            for(int column = row; column <= N; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}