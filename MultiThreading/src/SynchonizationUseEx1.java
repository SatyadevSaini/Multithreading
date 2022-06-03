class Source2 {
	int x ;
	int y;
	
	synchronized public void add(int a , int b ) {   // which thread will enter first it will lock it 
		//after complete this method leave it ....
		 x=a;
		 y=b;
		  try {
			  Thread.sleep(5000);
		  }catch (Exception e) {
		}
		  int r = x+y;
		  System.out.println("Result is :" +r);
	 }
}
class A3 extends Thread {
	Source2 s ;  
	A3(Source2 s){
		this.s =s;
	}
	@Override
	public void run() {
		s.add(20, 50);
	}
}
class B3 extends Thread {
	Source2 s ;  
	B3(Source2 s){
		this.s =s;
	}
	@Override
	public void run() {
		s.add(20, 500);
	}
}
 class SynchonizationUseEx1 {
	public static void main(String[] args) {
	Source2 s= new Source2();
	A3 a = new A3(s);
	a.start();
	B3 b = new B3(s);
	b.start();
	}

}
