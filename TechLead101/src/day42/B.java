package day42;

public class B extends A {
	// TODO Override each method from class A
	// by providing different implementation

	@Override
	public void hello() {
		System.out.println("Hello from class B! ");
		super.hello();
		// super.hello();
	}

	@Override
	public String javaIsFun() {
		// TODO Auto-generated method stub
		System.out.println("Java is fun from class B");
		return super.javaIsFun();
	}

	@Override
	public int sum(int num, int num2) {
		// TODO Auto-generated method stub
		System.out.println("sum in class B");

		return super.sum(num, num2) / 2;
	}
}