package Test_Strings;
import java.util.Scanner;
public class HighestPolindrome {

	public static boolean isPolindrome(String s,int n) {
		int l = 0;
		int h = n-1;
		while(l<=h) {
			if((s.charAt(l))!=(s.charAt(h))) {
				return false;
			}
			l++;
			h--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = sc.nextLine();
		String arr[] = s.split(" ");
		int cnt = 0;
		String ans="temp";
		for(String i : arr) {
			int n = i.length();
			if(isPolindrome(i,n) && n>cnt) {
				cnt = n;
				ans = i;
			}
		}
		System.out.print(ans+"  ");
		System.out.println(" is largest polindromic string in the given line");
		sc.close();
	}

}
