package ConstructorPrograms;

public class Person {
	String name;
	int age;
	Person(String name, int age){
		this.name= name;
		this.age = age;
	}
	void introduce() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
	public static void main(String args[]) {
		Person obj = new Person("uday",23);
		obj.introduce();
	}
}
