package day_3;
import java.util.Scanner;
abstract class Employee{
	String name;
	double salary, bonus;
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	abstract void calculateBonus();
	abstract void displayInfo();
}
class Manager extends Employee{
	Manager(String name, double salary){
		super(name, salary);
	}
	@Override
	void calculateBonus() {
		bonus = salary*0.2;
	}
	@Override
	void displayInfo() {
		System.out.println("Name: "+name+"\nSalary: Rs."+salary+"\nBonus: Rs."+bonus);
	}
}
class Developer extends Employee{
	Developer(String name, double salary){
		super(name, salary);
	}
	@Override
	void calculateBonus() {
		bonus = salary*0.1;
	}
	@Override
	void displayInfo() {
		System.out.println("Name: "+name+"\nSalary: Rs."+salary+"\nBonus: Rs."+bonus);
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details of Manager:");
		String mName = sc.nextLine();
		double mSalary = sc.nextDouble();
		sc.nextLine();
		Manager manager = new Manager(mName, mSalary);
		System.out.println("Details of Manager provided:");
		manager.calculateBonus();
		manager.displayInfo();
		System.out.println("Enter details of Developer:");
		String dName = sc.nextLine();
		double dSalary = sc.nextDouble();
		sc.nextLine();
		Developer developer = new Developer(dName, dSalary);
		System.out.println("Details of Developer provided:");
		developer.calculateBonus();
		developer.displayInfo();
		sc.close();
	}

}
