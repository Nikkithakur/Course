
interface A {
	public void test();
}

interface B {
	public void test();
}


public class MainClass implements A,B{
	
	public static void main(String[] args) {
		
		MainClass m = new MainClass();
		m.test();
		
		A a = new MainClass();
		a.test();
		
		B b = new MainClass();
		b.test();
	}

	@Override
	public void test() {
		 System.out.println(this.getClass().getSimpleName());
	}
}
