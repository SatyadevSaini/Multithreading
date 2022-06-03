class Source {
	int x; 
	int y;
	public void add(int a ,int b) {   // it is a source which will be used by  thread  
		x =a;
		y =b;
		int c = a+b;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
		System.out.println("Sum is :" +c);	
	}
}
 
class AA1 extends Thread {
	
	@Override
	public void run() {
		Source s = new Source();   //object creation
		s.add(50, 30);	            //calling 
		
	}
}
class BB1 extends Thread {
	
	@Override
	public void run() {
		Source s1 = new Source();   // object of the source class 
		s1.add(12, 23);            //calls its method 
	}
}

public class ThreadUsingSourceEx1 {

	public static void main(String[] args) {
		AA1 a = new AA1();
		a.start();
		BB1 b = new BB1();
		b.start();
	}

}
