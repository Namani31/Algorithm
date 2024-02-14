import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String userInput = br.readLine();
        int search = Integer.parseInt(br.readLine()) - 1;
        br.close();
        
        System.out.println(userInput.charAt(search));
    }
}