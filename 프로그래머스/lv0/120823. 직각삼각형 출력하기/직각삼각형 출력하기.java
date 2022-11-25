import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int columIndex = 0; columIndex < n; columIndex++) {
            for (int rowIndex = 0; rowIndex <= columIndex; rowIndex++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}