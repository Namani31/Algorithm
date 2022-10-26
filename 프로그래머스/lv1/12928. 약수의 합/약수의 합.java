class Solution
{
    public int solution(int num) {
        int answer = 0;

        for (int loop = 1; loop <= Math.sqrt(num); loop++) {
            // 나누어 떨어질 경우
            if (num % loop == 0)
            {
                // n의 제곱근일 경우
                if (loop * loop == num) {
                    answer += loop;
                }

                // n의 제곱근이 아닐 경우
                else {
                    answer += loop;
                    answer += num / loop;
                }
            }
        }
        return answer;
    }
}
