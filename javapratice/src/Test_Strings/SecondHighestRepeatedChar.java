package Test_Strings;
import java.util.Scanner;
import java.util.HashMap;
public class SecondHighestRepeatedChar {

	public static char findSecond(String s) {
		HashMap<Character,Integer> map = new HashMap<>();
		char ans = ' ';
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(map.containsKey(ch)) {
				Integer n = map.get(ch);
				map.put(ch, n+1);
			}
			else {
				map.put(s.charAt(i), 1);
			}
		}
		
		int cnt = 0;
		int cnt1 = cnt;
		char ans1 = ans;
		for(char i : map.keySet()) {
			System.out.println(i + " " +map.get(i));
			int n = map.get(i);
			if(n > cnt) {
				cnt1 = cnt;
				ans1 = ans;
				cnt = n;
				ans = i;
			}
			else if(n<cnt && n>cnt1) {
				cnt1 = n;
				ans1 = i;
			}
		}
		return ans1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.nextLine();
		System.out.println("Second Heighest Repeated character in given string is "+findSecond(s));
		sc.close();
	}

}
