import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diceA = scanner.nextInt();
        int diceB = scanner.nextInt();
        int diceC = scanner.nextInt();
        int max = -100001;
        
        // 만약 모든 변수가 다른 경우
        if ((diceA != diceB) && (diceB != diceC) && (diceA != diceC)) {
            if (diceA > diceB) {
                if(diceC > diceA) {
                    max = diceC;
                }
                else {
                    max = diceA;
                }
            }
            // b > a라면
            else {
                if(diceC > diceB) {
                    max = diceC;
                }
                else {
                    max = diceB;
                }
            }
            System.out.println(max * 100);
        }
        // 적어도 한 쌍 이상의 서로 같은 변수가 존재할 경우
        else {
            // 3개의 변수가 모두 같은 경우
            if((diceA == diceB) && (diceA == diceC)) {
                System.out.println(10000 + (diceA * 1000));
            } else {
                // A가 B 혹은 C랑만 같은 경우
                if((diceA == diceB) || (diceA == diceC)) {
                    System.out.println(1000 + (diceA * 100));
                }
                else {
                    System.out.println(1000 + (diceB * 100));
                }
            }
        }
    }
}