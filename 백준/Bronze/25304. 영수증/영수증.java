import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        int total = 0;
        
        for(int index = 0; index < N; index++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            total += (a * b);
        }
        
        if(total == X) {
            System.out.println("Yes");
        } else if (total != X) {
            System.out.println("No");
        }
    }
}