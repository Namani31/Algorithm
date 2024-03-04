import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for(int index = 1; index <= T; index++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            
            System.out.println("Case #" + index + ": " + (A+B));
        }
        scanner.close();
    }
}