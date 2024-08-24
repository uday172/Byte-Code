package basics;
import java.util.Scanner;
public class MaxOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(a>b?(a>c?a:c):(b>c?b:c));
		sc.close();
	}

}
