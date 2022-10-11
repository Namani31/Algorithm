class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for (int loop = 0; loop < array.length; loop++) {
            if (array[loop] > height)
                answer++;
        }
        
        return answer;
    }
}