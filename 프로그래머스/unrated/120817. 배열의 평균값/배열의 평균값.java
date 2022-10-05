class Solution {
    public double solution(int[] numbers) {
        int sum = 0;

        // for(반복 대상 변수명: 반복 대상)
        // {수행문}
        for (int loop : numbers) {
            sum += loop;
        }

        double answer = (double) sum / numbers.length;
        return answer;
    }
}