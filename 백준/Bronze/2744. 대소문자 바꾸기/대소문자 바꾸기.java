import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String userInput = br.readLine();
        StringBuilder sb = new StringBuilder();
        
        for(int loop = 0; loop < userInput.length(); loop++) {
            char ch = userInput.charAt(loop);
            if(Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(Character.toUpperCase(ch));
            }
        }
        System.out.println(sb);
    }
}