package basics;
import java.util.Scanner;
public class DisibleBy4and100 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%4==0 && n%100==0) {
			System.out.println("Divisible");
		}
		sc.close();
	}
}
