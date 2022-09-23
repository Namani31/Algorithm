import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int studentScore = 0;

        Scanner examScore = new Scanner(System.in);
        studentScore = examScore.nextInt();
        examScore.close();

        // || 를 쓰면 100보다 작을 시 무조건 <= 100 에 해당하므로 A가 출력되어 버림
        if (studentScore <= 100 && studentScore >= 90)
            System.out.println("A");
        else if (studentScore <= 89 && studentScore >= 80)
            System.out.println("B");
        else if (studentScore <= 79 && studentScore >= 70)
            System.out.println("C");
        else if (studentScore <= 69 && studentScore >= 60)
            System.out.println("D");
        else
            System.out.println("F");
    }
}