package ByteCodeTest1;
import java.util.Scanner;
//this is in git
class store{
	private String arr[] = {"apples","choclates","Buiscuits","Mangos","Bananas"};
	private int arr1[] = {180,70,70,100,50};
	static int ItemBuy[] = {0,0,0,0,0};
	void displayScreen(){
		System.out.println("Available Items in the Store :");
		for(int i =0;i<arr.length;i++){
			System.out.println((i+1) + ". "+arr[i]+"->"+arr1[i]+"Rs/kg");
		}
	}
	void AddItem(int n){
		int t = ItemBuy[n];
		ItemBuy[n]=t+1;
	}
	void DelItem(int n){
		if(ItemBuy[n]==0) System.out.println("There are no items to remove");
		ItemBuy[n]-=1;
	}
	void ItemsInCart(){
		System.out.println("Item in cart :");
		int total=0;
		for(int i=0;i<ItemBuy.length;i++){
			if(ItemBuy[i]!=0){
				System.out.println(arr[i]+"->"+ItemBuy[i]);
			}
			total+=arr1[i]*ItemBuy[i];
		}
		System.out.println("Total cost : "+total);
	}
}

class VendingMachine{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		boolean t = true;
		while(t){
			System.out.println("1.displayItems 2.AddItems 3.DeleteItems 4.viewCart 5.Exit");
			System.out.println("Enter any of above option :");
			int opt = sc.nextInt();
			store obj = new store();
			switch(opt){
			case 1:  obj.displayScreen();
				break;
			case 2: obj.displayScreen();
				System.out.println("Enter Item no : ");
				int n = sc.nextInt();
				obj.AddItem(n-1);
				break;
			case 3: System.out.println("Enter Item no to Remove : ");
				int m = sc.nextInt();
				obj.DelItem(m-1);
				break;
			case 4: obj.ItemsInCart();
				break;
			case 5: t = false;
				break;
			default:
				System.out.println("Enter correct Number");
			}
		}
		sc.close();
	}
}
