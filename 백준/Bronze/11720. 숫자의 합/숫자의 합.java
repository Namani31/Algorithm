import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
 
		int num = input.nextInt();
		String userNumber = input.next();
		input.close();
		
		int sum = 0;
        
		for(int loop = 0; loop < num; loop++) {
			sum += userNumber.charAt(loop)-'0';
		}
		System.out.print(sum);
	}
}
 