package Pratice;

public class Student1 {
	String sname;
	Double ssalary;

	void getdetais(String name, double salary) {
		sname = name;
		ssalary = salary;
	}

	void display() {
		System.out.println(sname + " " + ssalary);
	}

}
