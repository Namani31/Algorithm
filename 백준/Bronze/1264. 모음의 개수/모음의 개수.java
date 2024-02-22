import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String str = scanner.nextLine();
            int count = 0;
            
            if(str.equals("#")) {
                break;
            }
            
            for(int index = 0; index < str.length(); index++) {
                if(str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i' || str.charAt(index) == 'o' || str.charAt(index) == 'u'
                  || str.charAt(index) == 'A' || str.charAt(index) == 'E' || str.charAt(index) == 'I' || str.charAt(index) == 'O' || str.charAt(index) == 'U') {
                    count++;
                }
            }
            System.out.println(count);
        }
        scanner.close();
    }
}