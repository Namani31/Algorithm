import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(buffer.readLine());
        
        System.out.println(st.countTokens());
    }
}