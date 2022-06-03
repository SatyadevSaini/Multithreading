class Aa extends Thread  {   // 2 way to declare a thread
	
	public void m1 () {    // it is methods  
		System.out.println("method m1 ");
		System.out.println("hey method ");
		System.out.println("hey methojdjfjlksjaoj");
		System.out.println("gsjhjdghjkeh");
		System.out.println("uhesgh");
		System.out.println("it is m1");
		System.out.println("last line of method");
	}
	@Override
	public void run() {      // here it is not complasy to implement run method because it is class not interface... 
		System.out.println("aa1");
		System.out.println("aa2");
		
		 m1();  // direct start calling no need to pass object in thread class because thread class is parent  
		System.out.println("aa3");//class of the Runnable Interface .....so direct calling //mixing will happpened
		
		      System.out.println("aa4");	
	}
}
class BB extends Thread {
	
	@Override
	public void run() {
		System.out.println("BB1");
		System.out.println("BB2");
		System.out.println("BB3");
		System.out.println("BB4");
		System.out.println("BB5");
	}
}

public class DeclareMultithreadingClass2WayEx1 {

	public static void main(String[] args) {
		Aa a2 = new Aa();
		a2.start();     // thread execute here   // direct start calling no need to pass object in thread
		//class because thread class is parent 
		BB b = new BB();
		b.start(); // thread execute here

	}

}
