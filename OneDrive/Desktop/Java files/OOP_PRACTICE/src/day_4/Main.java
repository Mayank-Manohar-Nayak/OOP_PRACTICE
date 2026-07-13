package day_4;

interface Printable{
	void print();
}
interface Scannable{
	void scan();
}
class PrintingMachine implements Printable, Scannable{
	@Override
	public void print() {
		System.out.println("Printing...");
	}
	@Override
	public void scan() {
		System.out.println("Scanning...");
	}
}
public class Main {

	public static void main(String[] args) {
		PrintingMachine pm = new PrintingMachine();
		pm.print();
		pm.scan();
		
	}

}
