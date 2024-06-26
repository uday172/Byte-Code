package basics;

public class CheckAlphabetOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='Z';
		if((ch>='a' && ch<='z')||(ch>='A' && ch <='Z')) {
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Not a Alphabet");
		}
	}

}
