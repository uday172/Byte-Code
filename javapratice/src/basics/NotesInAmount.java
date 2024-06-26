package basics;

public class NotesInAmount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount= 1250;
		int total = 0;
		if(amount>=500) {
			total += amount/500;
			amount -= 500*(amount/500);
		}
		if(amount>=200) {
			total+=amount/200;
			amount -= 200*(amount/200);
		}
		if(amount >=100) {
			total+=amount/100;
			amount-=100*(amount/100);
		}
		if(amount>=50) {
			total+=amount/50;
			amount-=50*(amount/50);
		}
		if(amount>=20) {
			total+=amount/20;
			amount-=20*(amount/20);
		}
		if(amount>=10) {
			total+=amount/10;
			amount-=10*(amount/10);
		}
		System.out.println("Minimum notes reqired are "+total);	
		}
}
