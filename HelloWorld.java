
public class HelloWorld {
	
	public void method1() {
		System.out.println("method1");
	}
	public int method2() {
		System.out.println("method2");
		return 0;
	}
	public String method3() {
		System.out.println("method3");
		return " ";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld a=new HelloWorld();
		a.method1();
		a.method2();
		a.method3();
	}
}
