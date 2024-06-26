package basics;

public class GreatestOfFourByTernary {
	public static void main(String args[]) {
		int a = 10, b=20 , c = 500, d = 160;
		System.out.println(a>b?(a>c?(a>d?a:d):(c>d?c:d)):(b>c?(b>d?b:d):(c>d?c:d)));
	}
}
