import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int loop = N / 4;
        scanner.close();
        
        for(int index = 0; index < loop; index++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}