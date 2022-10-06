class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int loop = 1; loop <= n; loop++) {
            if (loop % 2 == 0)
            answer += loop;
        }
        return answer;
    }
}