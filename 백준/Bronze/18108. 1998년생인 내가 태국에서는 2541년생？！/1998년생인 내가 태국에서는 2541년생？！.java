import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year = 0;

        Scanner input = new Scanner(System.in);

        year = input.nextInt();
        input.close();

        if (year < 1000 || year > 3000)
            return;
        else
            year -= 543;
        System.out.println(year);
    }
}
