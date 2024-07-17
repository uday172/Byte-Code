package basics;
import java.util.Scanner;
public class CubeUptoAGivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println((int)Math.pow(i,3));
		}
	}
}
