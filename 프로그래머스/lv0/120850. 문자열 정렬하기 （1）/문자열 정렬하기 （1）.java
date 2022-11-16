import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String removeChar= my_string.replaceAll("[^0-9]", ""); // 숫자만 남기고 문자열 제거
        int[] answer = Arrays.stream(removeChar.split("")).mapToInt(Integer::parseInt).toArray();
        // removeChar에 있는 문자열을 공백 기준으로 split 하고, stream을 IntStream으로 변환하고, 다시 Array (배열)로 변환한다.

        Arrays.sort(answer);

        return answer;
    }
}