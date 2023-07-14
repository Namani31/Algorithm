import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int testCase = Integer.parseInt(bf.readLine());
        
        for (int plusLoop = 0; plusLoop < testCase; plusLoop++) {
            String str = bf.readLine();
            int numA = Integer.parseInt(str.split(" ")[0]);
            int numB = Integer.parseInt(str.split(" ")[1]);
            
            bw.write(numA + numB + "\n");
        }
        
        bw.flush();
    }
}