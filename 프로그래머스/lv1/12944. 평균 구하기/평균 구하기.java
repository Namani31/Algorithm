class Solution {
    public double solution(int[] arr) {
        double answer = 0.0;
        double sum = 0.0;

        for (int loop = 0; loop < arr.length; loop++) {
            sum += arr[loop];
        }
        answer = sum / arr.length;
        return answer;
    }
}