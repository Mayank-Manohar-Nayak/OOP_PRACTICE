package day_5;
interface Shape{
	void draw();
}
class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("Drawing a Circle.");
	}
}
class Rectangle implements Shape{
	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle.");
	}
}
class Triangle implements Shape{
	@Override
	public void draw() {
		System.out.println("Drawing a Triangle.");
	}
}
public class Main {

	public static void main(String[] args) {
		Shape shape;
		shape = new Circle();
		shape.draw();
		shape = new Rectangle();
		shape.draw();
		shape = new Triangle();
		shape.draw();
	}

}
