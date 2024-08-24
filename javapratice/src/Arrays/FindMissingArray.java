package Arrays;

import java.util.Scanner;
public class FindMissingArray {
	
	static boolean findVal(int num,int arr[]) {
		for(int i:arr) {
			if(i==num) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the size of Array :");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the elements of an array :");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=1;i<=n;i++) {
			if(!findVal(i,arr)) {
				System.out.println("Missing Value is "+i);
			}
		}
		sc.close();
	}

}
