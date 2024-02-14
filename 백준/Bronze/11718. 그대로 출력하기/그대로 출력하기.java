import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String userInput = "";
        
        while((userInput = br.readLine()) != null) {
            System.out.println(userInput);
        }
    }
}