package basics;
public class TriangleByAngles {
	public static void main(String[] args) {
		int a = 45;
		int b = 45;
		int c = 90;
		if((a+b+c)==180) {
			System.out.println("Triangle is possible");
		}
		else {
			System.out.println("Triangle is not possible");
		}
	}
}
