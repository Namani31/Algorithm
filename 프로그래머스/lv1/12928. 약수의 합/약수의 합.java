class Solution {
    public int solution(int num) {
        int answer = 0;

        for (int div = 1; div <= num; div++) {
            if (num % div == 0) {
                answer += div;
            }
        }
        return answer;
    }
}