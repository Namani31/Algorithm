class Solution {
    public int solution(int age) {
        // 태어난 연도에 1살이므로 +1 해줘야 함
        int answer = 2022 - age + 1;
        return answer;
    }
}