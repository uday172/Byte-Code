package ByteCodeTest1;
class EvenOddArray{
	public static void main(String args[]){
		int arr[] = {1,3,2,4,5,2,8,0,1,0,3,7,8,9};
		int l = 0;
		int h = 0;
		int n = arr.length;
		while(h<n){
			if(arr[h]%2==0 && l%2==0 && arr[h]!=0){
				if(l==h){
					l++;
					h++;
				}
				else{
					int t = arr[l];
					arr[l] = arr[h];
					arr[h] =t;
					l++;
				}
			}
			else if(arr[h]%2!=0 && l%2!=0){
				if(l==h){
					l++;
					h++;
				}
				else{
					int t = arr[l];
					arr[l] = arr[h];
					arr[h] =t;
					l++;
				}
			}
			else{
				h++;
			}
		}
		for(int i = l;i<n;i++){
			arr[i]=0;
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}