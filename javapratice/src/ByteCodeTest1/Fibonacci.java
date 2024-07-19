package ByteCodeTest1;
class Fibonacci{
	public static void main(String args[]){
		int n = 54;
		int t1 = 0;
		int t2 = 1;
		int t3 = 0;
		System.out.print(t1+" "+t2);
		while(t2<=n){
			t3 = t1+t2;
			System.out.print(" "+t3);
			t1 = t2;
			t2 = t3;
		}
	}
}