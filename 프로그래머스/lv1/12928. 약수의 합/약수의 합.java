class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int index = 1; index <= Math.sqrt(n); index++) {
            if (n % index == 0) {
                answer += index;
                
                int check = n / index;
                
                if (index != check) {
                    answer += check;
                }
            }
        }
        return answer;
    }
}