class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for(int loop = 0; loop < array.length; loop++) {
            if(array[loop] == n) {
                answer++;
            }
        }
        return answer;
    }
}