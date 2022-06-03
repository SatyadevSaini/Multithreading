class Source3 {
	int x ;
	int y;
	public void add(int a , int b ) {
		System.out.println("hey ");
		System.out.println("hello ");  // we want to use it in the thread as multithreading  
		System.out.println("bye");
		 synchronized (this) {  // this is used for current object which will be came first it will goes
			 //inside the block & done his work then out after 2 thread enter in the block..
				x =a;
				y =b;
			 try { Thread.sleep(1000); }catch (Exception e) { }
			 int c = x+y;
			 System.out.println("Result is :" +c);	
		}
	}
}
class Thread1 extends Thread {
	Source3 s;
	Thread1(Source3 s){
		this.s = s;   // current object  s holds the varible of the Source3 class 
	}
	@Override
	public void run() {
	s.add(20, 30);
	}
}
class Thread2 extends Thread {
	Source3 s;
	Thread2(Source3 s){
		this.s = s;   // current object  s holds the varible of the Source3 class 
	}
	@Override
	public void run() {
	s.add(40, 60);
	}
}
public class SynchroniseBlockEx1 {
	public static void main(String[] args) {
		 Source3 s = new Source3();
		 new Thread1(s).start();
		 new Thread2(s).start();

	}

}
