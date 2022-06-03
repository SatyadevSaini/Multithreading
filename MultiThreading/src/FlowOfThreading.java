class A2 implements Runnable {
	@Override
	public void run() {
		System.out.println("A1");  //2 
		System.out.println("A2");  //3 because only one thread & executed top to bottom ..
		B2 b = new B2();
		Thread t1 = new Thread(b); 
		t1.start();                 // thread Calling here 
		System.out.println("A3"); // now we cannot say anything which will run now ...
		System.out.println("A4"); // because we have 2 threads now 
		System.out.println("A5");
		System.out.println("A6");
	}
}
class B2 implements Runnable {
	@Override
	public void run() { 
		System.out.println("b1");
		System.out.println("b2");
		System.out.println("b3");
		System.out.println("b4");
		System.out.println("b5");	
	}	
}
public class FlowOfThreading {  

	public static void main(String[] args) { // main method is also a thread
//    System.out.println("its adisjjgj");  //firstly because still no thread came.. 
//    System.out.println("its adisjjgj");  //firstly because still no thread came.. 
//    System.out.println("its adisjjgj");  //firstly because still no thread came.. 
//    System.out.println("its adisjjgj");  //firstly because still no thread came.. 
//    System.out.println("its adisjjgj");  //firstly because still no thread came.. 
		A2 a = new A2();
		Thread t2 = new Thread(a);
		t2.start();
		System.out.println("its adisjjgj");  //firstly because still no thread came.. 
		
		System.out.println("its adisjjgj");  //firstly because still no thread came.. 
		System.out.println("its adisjjgj");  //firstly because still no thread came.. 
		System.out.println("its adisjjgj");  //firstly because still no thread came.. 
		System.out.println("its adisjjgj");  //firstly because still no thread came.. 
		
		
	}
}
