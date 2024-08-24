package Arrays;
import java.util.*;
public class OddEvenPositionArray {
	
	public static void swap(int a , int b, int arr[]) {
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
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
		int l = 0;
		int h = 0;
		while(h<n) {
			if(arr[h]%2==0 && l%2==0 &&arr[h]!=0) {
				if(l!=h) {
					swap(l,h,arr);
					l++;
				}
				else {
					h++;
				}
			}
			else if(arr[h]%2!=0 && l%2!=0){
				if(l!=h) {
					swap(l,h,arr);
					l++;	
				}
				else {
					h++;
				}
			}
			else {
				h++;
			}
		}
		while(l<n) {
			arr[l++]=0;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
