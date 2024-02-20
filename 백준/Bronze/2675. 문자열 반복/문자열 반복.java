import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // String과 문자열을 더할 때 StringBuilder를 쓴다
 
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수
 
        for (int i = 0; i < T; i++) {
 
            StringTokenizer st = new StringTokenizer(br.readLine());  // 띄어쓰기를 기준으로 문자열을 분리함
 
            int R = Integer.parseInt(st.nextToken()); // 반복 횟수
            String S = st.nextToken(); // 반복할 문자
 
            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    sb.append(S.charAt(j));
                    // String.charAt(n) = n번 째 위치의 문자를 char 형태로 반환함
                    // append = 문자열을 더하는 역할을 하는 method
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}