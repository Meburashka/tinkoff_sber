package sber.tin.koff;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello();
	}

	public static void hello() {
		Hello hello = new Hello("Hello, world");
		System.out.println(hello);
	}
}