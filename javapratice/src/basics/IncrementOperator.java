package basics;

public class IncrementOperator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		int n = i++ %5;
		System.out.println("value of i : "+i +" value of n : "+n);
		n=0;
		i=10;
		n = ++i%5;
		System.out.println("value of i : "+i +" value of n : "+n);
	}
}
