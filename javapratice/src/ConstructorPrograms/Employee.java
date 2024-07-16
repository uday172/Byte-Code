package ConstructorPrograms;

class Person1{
	String name;
	int age;
	Person1(int age,String name){
		this.age =age;
		this.name = name;
	}
}

public class Employee extends Person1 {
    private int salary;

    public Employee(int age, String name, int salary) {
        super(age, name);
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(26, "Manoj", 50000);
        emp.displaySalary();
    }
}

