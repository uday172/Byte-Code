package basics;

public class CheckAlphabetDigitSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = '1';
		if((ch>='a'&&ch<='z')||(ch>='A' && ch<='Z')) {
			System.out.println("Alphabet");
		}
		else if(ch>='0' && ch<='9') {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Character");
		}
	}
}
