package ByteCodeTest1;
class Polindrome{
	static boolean isPolindrome(int n){
		int t = n;
		int r = 0;
		int s = 0;
		while(n>0){
			r = n%10;
			s = s*10+r;
			n = n/10;
		}
		if(s==t) return true;
		return false;
	}
	public static void main(String args[]){
		int a[] = {2357,568568,1238321,2325532};
		int max = 0;
		for(int i =0;i<a.length;i++){
			if(a[i]>max && isPolindrome(a[i])){
				max = a[i];
			}
		}
		System.out.println(max);
	}
}