import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = (long) Math.sqrt(n);  // n의 제곱근 찾기 (어떤 양의 정수 x 임)

        if (Math.pow(answer, 2) == n) {
            return (long) Math.pow(answer + 1, 2);  // n이 어떤 양의 정수 x의 제곱이라면, 제곱근에 1을 더한 후 제곱
        } else {
            return -1;
        }
    }
}
