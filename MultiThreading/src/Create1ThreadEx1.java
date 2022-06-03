class A implements Runnable { //thread Declarartion
	
	@Override
	public void run() {   // method of Runnable complasary to Override for making thread 
		System.out.println("A1");
		System.out.println("A2");
		System.out.println("A3");
		System.out.println("A4");
		System.out.println("A5");
		System.out.println("A6");
		System.out.println("A7");	
	}
	
}
class B implements Runnable {
	
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
public class Create1ThreadEx1 {

	public static void main(String[] args) {
		   System.out.println(" it is THread CreATION");
		  A a = new A();   //create the object of the class 
		  Thread t1 = new Thread(a); //pass that object in the object of thread class  //Thread Creation
		  
		  System.out.println("1 thread complete");  // it i will run before the thread t2 complasary 
		  //because still thread t2 is not started yet ....
		  
		  B b = new B();   
		  Thread t2 = new Thread(b);  //it is thread jvm decide when it will run it is not in our hand 
		  t2.start();
		  t1.start(); //Thread Execution...
		  System.out.println("Complete the Thread ");
		  

	}

}
