package ByteCodeTest1;
import java.util.Scanner;
class Harshad{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = n;
		int s =0;
		while(n>0){
			int r = n%10;
			s+=r;
			n=n/10;
		}
		if(t%s==0) System.out.println("Harshad Number");
		else System.out.println("Not an Harshad Number");
	}
}