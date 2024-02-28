import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> hash = new HashSet<Integer>();
        
        for(int index = 0; index < 10; index++) {
            hash.add(scanner.nextInt() % 42);
        }
        
        scanner.close();
        System.out.println(hash.size());
    }
}