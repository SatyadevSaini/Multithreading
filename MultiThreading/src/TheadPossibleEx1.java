class A1 implements Runnable {
	
	@Override
	public void run() {   // complasary to override
		
		System.out.println("A1");
		System.out.println("A2");
		System.out.println("A3");
		System.out.println("A4");
		System.out.println("A5");
		System.out.println("A6");
		System.out.println("A7");	
	}
}
class B1 implements Runnable {
	
	@Override
	public void run() {
		System.out.println("B1");
		System.out.println("B2");
		System.out.println("B3");
		System.out.println("B4");
		System.out.println("B5");
		System.out.println("B6");			
	}
}
public class TheadPossibleEx1 {

	public static void main(String[] args) {
	
		A1 a = new A1();
		Thread t1 = new Thread(a); // thread creation
		t1.start();
	//	t1.start(); // exception because we cannot start a start twice
		B1 b = new B1();
		Thread t2 = new Thread(b); 
		t2.start();
		Thread t3 = new Thread(b);  // valid to pass a object in two threaads // b passes twice
		t3.start();
		System.out.println("compleed it can be print anywhere "); // anywhere 
	
	}

}
