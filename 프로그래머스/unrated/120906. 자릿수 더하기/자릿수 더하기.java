class Solution {
    public int solution(int n) {
        int answer = 0;

        // 0이 될 때까지 반복
        while (n != 0) {
            
            // n을 10으로 나눈 나머지를 answer에 더하고 (예: 1234 % 10 = 4)
            answer += n % 10;

            // n을 10으로 나눈 값을 다시 n에 저장함 (예: 1234 / 10 = 123)
            n /= 10;
        }

        return answer;
    }
}