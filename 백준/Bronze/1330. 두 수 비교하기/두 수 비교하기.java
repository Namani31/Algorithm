import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lNum = 0;
        int rNum = 0;

        Scanner input = new Scanner(System.in);

        lNum = input.nextInt();
        rNum = input.nextInt();
        input.close();

        if (lNum > rNum)
            System.out.println(">");
        else if (lNum < rNum)
            System.out.println("<");
        else
            System.out.println("==");
    }
}
