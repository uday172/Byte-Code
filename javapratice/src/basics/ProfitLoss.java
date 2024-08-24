package basics;
import java.util.Scanner;
public class ProfitLoss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cp = sc.nextInt();
		int sp = sc.nextInt();
		if(cp>sp) {
			System.out.println("loss");
		}
		else if(sp>cp){
			System.out.println("profit");
		}
		else {
			System.out.println("no profit no loss");
		}
		sc.close();
	}
}
