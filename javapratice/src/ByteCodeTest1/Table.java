package ByteCodeTest1;
class Table{
	public static void main(String args[]){
		int evenArr[] = new int[6];
		int oddArr[] = new int[5];
		int p = 0;
		int l = 0;
		for(int i=0;i<=10;i++){
			if(i%2==0){
				evenArr[p++]=5*i;
			}
			else{
				oddArr[l++]=5*i;
			}
		}
		int arr[]= new int[evenArr.length+oddArr.length];
		int k =0;
		for(int i=0;i<evenArr.length;i++){
			arr[k++]=evenArr[i];
		}
		for(int i : oddArr){
			arr[k++]=i;
		}
		int total = 0;
		for(int i : arr){
			total+=i;
		}
		int n = total;
		int t = 0;
		while(n>0){
			int r = n%10;
			if(r==0){
				t=1;
				break;
			}
			n = n/10;
		}
		if(t==0){
			System.out.println("It is an duck number");
		}
		else{
			System.out.println("It is not an duck number");
		}
	}
}