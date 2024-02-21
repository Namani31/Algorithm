import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26]; // 영문자의 개수 26개
        String input = buffer.readLine();

        for (int index = 0; index < input.length(); index++) {
            /*
             D를 입력받았을 때, 배열의 세 번째 원소인 3을 도출해내려면
             D는 68이므로 A의 아스키 코드 값인 65를 뺀다. -> 68 - 65 = 3
             만약 소문자 e를 입력 받았다면 다섯번째 원소인 4를 도출해야하므로
             a의 아스키 코드값인 97을 뺀다. -> 101 - 97 = 4
             */
            if ('A' <= input.charAt(index) && input.charAt(index) <= 'Z') {
                arr[input.charAt(index) - 'A']++;
            } else {
                arr[input.charAt(index) - 'a']++;
            }
        }

        int max = -1;
        char ch = '\0';

        for(int index = 0; index < 26; index++) {
            if(arr[index] > max) {
                max = arr[index];
                ch = (char)(index + 65); // 대문자 출력하기 위해 A의 아스키 코드인 65 더하기
            } else if(arr[index] == max) {
                /*
                    예를 들어 arr = ['A', 'D', 'C', 'e', 'D'] 라고 한다면
                    이 배열에서 최대 값은 D 이지만 arr[2]인지 arr[4]인지 알 수 없음
                    max가 arr[2]와 값을 비교한 후, max의 값이 68 (아스키 코드값) 로 변경된다.
                    이후 max와 arr[4]가 값을 비교하는데 max와 arr[4]의 값이 68로 동일하다면
                    최대 개수가 중복되었다는 말이기 때문에 ch를 ?로 바꾼다.
                 */
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}