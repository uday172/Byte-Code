package Test_Strings;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
class Emp{
	int empid;
	String empname;
	public Emp(int empid , String empname){
		this.empid=empid;
		this.empname = empname;
	}
}

public class ObjectCollection {
	public static ArrayList<Emp> arr = new ArrayList<Emp>();
	public static Scanner sc = new Scanner(System.in);
	public static void addElements(int n) {
		if(n<=100) {
			Emp obj = new Emp(n,("Employee"+n));
			addElements(++n);
			arr.add(obj);
		}
	}
	
	public static void findDetails(int n) {
		Iterator<Emp> i = arr.iterator();
		while(i.hasNext()) {
			Emp e = i.next();
			if(e.empid == n) {
				System.out.println("Details of the asked employee is ");
				System.out.println("Employee Id : "+e.empid);
				System.out.println("Employee Name : "+e.empname);
			}
		}
	}
	
	public static void main(String[] args) {
		addElements(1);
		System.out.println("Enter employee id : ");
		int n = sc.nextInt();
		findDetails(n);
		sc.close();
	}

}
