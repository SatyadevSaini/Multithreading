class Source4 {
	int amount;
	synchronized public int withdraw() {
		if(amount ==0) {
			try { wait();  }  catch(Exception e ) {  }
			}
		return amount;
}
	synchronized void  deposite(int a) {
		amount =a;
		notify();
	  //notifyAll();
		System.out.println("Deposite amount :" +amount);
	}
}
class User1 extends Thread {
	Source4 s ;
	public User1(Source4 s) {
		this.s = s;
	}
	@Override
	public void run() {
		System.out.println("amount Withdraw :" + s.withdraw());
	}
}
class User2 extends Thread {
	Source4 s;
	public User2(Source4 s) {
		this.s = s;
	}
	@Override
	public void run() {
	System.out.println("amount deposite");
	 s.deposite(10000);
	}
}
public class WaitNotifyMethodEx1 {
	public static void main(String[] args) {
	Source4 s= new Source4();
	new User1(s).start();
	new User2(s).start();

	}

}
