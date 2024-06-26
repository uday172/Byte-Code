package basics;

public class LeapYearUsingTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2001;
		System.out.println(year%4==0?(year%100==0?(year%400==0?"Leap Year":"Not a Leap Year"):"Leap Year"):"Not a Leap Year");
	}

}
