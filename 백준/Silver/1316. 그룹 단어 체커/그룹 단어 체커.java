import java.util.Scanner;

/*
    그룹 단어란 단어를 이루는 각 문자들이 연속해서 나타나는 단어
    그룹 단어가 아니라면 단어 안에 '불연속적'으로 나타나는 문자가 있는 단어
 */
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        int N = sc.nextInt();

        for (int loop = 0; loop < N; loop++) {
            // true 이면 그룹 단어
            if (groupWordCheck() == true) {
                count++;
            }
        }
        System.out.print(count);
    }

    public static boolean groupWordCheck() {
        boolean[] groupWordCheck = new boolean[26];
        int prevWord = 0;
        String userStr = sc.next();

        for (int loop = 0; loop < userStr.length(); loop++) {
            int nowWord = userStr.charAt(loop);

            // 앞에 있는 문자와 현재 문자가 같지 않다면 중복 검사 해야 함
            if (prevWord != nowWord) {
                // 해당 문자가 처음 나오는 경우면 그룹 단어
                // boolean 배열의 기본 초기화 값은 false
                if (groupWordCheck[nowWord - 'a'] == false) {
                    groupWordCheck[nowWord - 'a'] = true;
                    prevWord = nowWord;
                } else { // 해당 문자가 이미 나온 적이 있다면 그룹 단어가 아님
                    return false;
                }
            } else {    // 연속된 문자라면 이어나가기
                continue;
            }
        }
        return true;
    }
}