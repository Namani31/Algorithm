import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int index = 0; index < testCase; index++) {
            String userInput = br.readLine();
            sb.append(userInput.charAt(0));
            sb.append(userInput.charAt(userInput.length() - 1) + "\n");
        }
        System.out.println(sb);
    }
}