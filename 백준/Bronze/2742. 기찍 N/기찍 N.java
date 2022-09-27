import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int loop = num; loop > 0;loop-- ){
            System.out.println(num--);
        }
    }
}

