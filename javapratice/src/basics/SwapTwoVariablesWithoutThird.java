package basics;

public class SwapTwoVariablesWithoutThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		System.out.println("Before Swaping a : "+a+" b: "+b);
		a = a+b;
		b=a-b;
		a=a-b;
		System.out.println("Before Swaping a : "+a+" b: "+b);
	}

}
