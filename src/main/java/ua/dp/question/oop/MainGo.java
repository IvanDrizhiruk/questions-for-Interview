package ua.dp.question.oop;

class GoBase {
	static {
		System.out.println("<<< Hello from GoBase >>>");
	}

	public GoBase(int n) {
		init(n);
		print(n);
	}

	public void init(int n) {
		System.out.println("<<< init GoBase " + n + ">>>");
	}

	public static void print(int n) {
		System.out.println("<<< print GoBase " + n + ">>>");
	}
}

class Go extends GoBase {
	static {
		System.out.println("Hello from Go");
	}

	public Go(int n) {
		super(n);
		init(n);
		print(n);
	}

	@Override
	public void init(int n) {
		System.out.println("Init Go " + n);
	}

	public static void print(int n) {
		System.out.println("Print Go " + n);
	}
}

public class MainGo {

	public static void main(String[] args) {
		GoBase g1 = new Go(5);
		Go g2 = new Go(7);

		g1.init(10);
		g2.init(20);
	}
}

