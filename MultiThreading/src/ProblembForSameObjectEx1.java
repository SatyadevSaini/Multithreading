class Source1 {    // it is source here 
	int x;
	int y;
	
	public void add(int a , int b ) {
		x=a;
		y=b;
		try {
			Thread.sleep(3000);      // uses here for understanding problemmu
		}catch (Exception e) {
	}
		int r = x+y;
		System.out.println("sum is :" +r);	
	}
}
class A21 extends Thread {
	Source1 s ;       // variable of source class 
	A21(Source1 s){   // s is reference variable of Source class passes in the constructor for use class A2 
		this.s = s;	  // this means current object reference 
	}
	@Override
	public void run() {
		s.add(30, 20); // value passes 
	}
}
class B21 extends Thread {
	Source1 s;                       // variable of source class 
	B21(Source1 s){
		this.s =s;    // s is reference variable of Source class passes in the constructor for use class B2 
	}
	@Override
	public void run() {
		s.add(50, 80);
	}
}
public class ProblembForSameObjectEx1 {
	public static void main(String[] args) {
		Source1 s = new Source1();
		A21 a = new A21(s);
		a.start();     //start thread A2 class with same object (s) ...of Source class  
		B21 b = new B21(s);
		b.start();     //start thread B2 class with same object (s) ...of Source class  
	}
}
