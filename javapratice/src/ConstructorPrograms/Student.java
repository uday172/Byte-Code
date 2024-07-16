package ConstructorPrograms;

public class Student {
	private String name;
	private int age;
	private double GPA;
	Student(String name,int age,double GPA){
		this.name = name;
		this.age = age;
		this.GPA = GPA;
	}
	Student(String name,int age){
		this.name = name;
		this.age = age;
		this.GPA = 0.0;
	}
	void displayGPA() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("GPA : "+GPA);
	}
	public static void main(String[] args) {
		Student s1 = new Student("Manoj",54,9.1);
		s1.displayGPA();
		Student s2 = new Student("uday",23);
		s2.displayGPA();
	}

}
