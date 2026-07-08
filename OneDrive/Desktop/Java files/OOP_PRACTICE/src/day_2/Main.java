package day_2;
import java.util.Scanner;
class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	public void displayInfo() {
		System.out.println("Name: "+this.name+"\nAge: "+this.age);
	}
}
class Student extends Person{
	String course;
	Student(String name, int age, String course){
		super(name,age);
		this.course=course;
	}
	@Override
	public void displayInfo() {
		System.out.println("Student details:");
		System.out.println("Name: "+this.name+"\nAge: "+this.age+"\nCourse: "+this.course);
	}
}
class Teacher extends Person{
	String subject;
	Teacher(String name, int age, String subject){
		super(name,age);
		this.subject=subject;
	}
	@Override
	public void displayInfo() {
		System.out.println("Teacher details:");
		System.out.println("Name: "+this.name+"\nAge: "+this.age+"\nSubject: "+this.subject);
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details of student:");
		String sName=sc.nextLine();
		int sAge=sc.nextInt();
		sc.nextLine();
		String sCourse=sc.nextLine();
		Student s = new Student(sName, sAge, sCourse);
		s.displayInfo();
		System.out.println("Enter details of teacher:");
		String tName=sc.nextLine();
		int tAge=sc.nextInt();
		sc.nextLine();
		String tSubject=sc.nextLine();
		Teacher t = new Teacher(tName, tAge, tSubject);
		t.displayInfo();
		sc.close();
	}

}
