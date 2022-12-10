import java.util.*;

class Solution {
    public int solution(int n) {
        int pizzaBox = 6;
        
        while (pizzaBox % n != 0) {
            pizzaBox += 6;
        }
        return pizzaBox / 6;
    }
}
