package basics;

public class TypeOfTriangleBysides {
	public static void main(String[] args) {
		int s1 = 10,s2=11,s3=13;
		if(s1==s2 && s2==s3 && s1==s3) {
			System.out.println("Regular");
		}
		else if(s1==s2 || s2==s3 || s3 ==s1 ) {
			System.out.println("Symmetric");
		}
		else {
			System.out.println("Irregular");
		}
	}
}
