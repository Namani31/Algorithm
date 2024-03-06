import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        
        if (N < 2) {
            System.out.println("1");
        } else {
            int fac = 1;
            for (int index = 2; index <= N; index++) {
                fac = fac * index;
            }
            System.out.println(fac);
        }
    }
}