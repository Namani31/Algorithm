import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int T = Integer.parseInt(buffer.readLine());
        int A;
        int B;
        
        for(int index = 1; index <= T; index++) {
            st = new StringTokenizer(buffer.readLine(), " ");
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            System.out.println("Case #" + index + ": " + A + " + " + B + " = " + (A+B));
        }
        buffer.close();
    }
}