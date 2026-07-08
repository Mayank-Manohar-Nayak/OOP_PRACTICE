package day_1;
import java.util.Scanner;
class Book {
	private String title;
	private String author;
	private float price;
	Book(String title, String author, float price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	public float getPrice() {
		return this.price;
	}
	
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details of Book: ");
		String title = sc.nextLine();
		String author = sc.nextLine();
		float price = sc.nextFloat();
		Book b = new Book(title, author, price);
		System.out.println("Details of book provided:");
		System.out.println("Title: "+ b.getTitle());
		System.out.println("Author: "+ b.getAuthor());
		System.out.println("Price: "+ b.getPrice());
		sc.close();
	}

}
