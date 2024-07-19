package ByteCodeTest1;
class Duplicates{
	public static void main(String args[]){
		int a[] ={1,4,2,6,8,2,3,1,3,5,1,2,1,4,5,1};
		int cnt=0;
		int maxcnt = 0;
		int ans = -1;
		for(int i=0;i<a.length;i++){
			cnt = 0;
			if(a[i]!=-1)
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					cnt++;
					a[j]=-1;
				}
			}
			if(cnt>maxcnt){
				maxcnt = cnt;
				ans = a[i];
			}
			if(cnt!=0)
				a[i]=-1;
		}
		System.out.println("Max Duplicate Number is "+ans);
		System.out.println("Removing of Duplicates");
		for(int i=0;i<a.length;i++){
			if(i!=-1)
			System.out.print(a[i]+" ");
		}
	}
}