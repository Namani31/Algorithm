class Solution {
    public int solution(int num) {
        if (num < 0 || num > 3000)
            return -1;

        int answer = 0;

        // 모든 약수의 합이므로 절반까지, 소수 중 2가 가장 작으니까
        for(int loop = 1; loop <= num / 2; loop++){
            if(num % loop == 0)
                answer += loop;
        }
        // 약수 중에 자기 자신 포함
        return answer + num;
    }
}