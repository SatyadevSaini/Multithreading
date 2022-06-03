class TT1 extends Thread{
	String r1,r2;
	public TT1(String r1, String r2) {
		this.r1=r1;
		this.r2=r2;
	}
	@Override
	public void run() {
		synchronized (r1) {
			System.out.println("T1 locked r1");
			synchronized (r2) {
				System.out.println("T1 locked r2");
			}
		}
	}
}
class TT2 extends Thread{
	String r1,r2;
	public TT2(String r1, String r2) {
		this.r1=r1;
		this.r2=r2;
	}
	@Override
	public void run() {
		synchronized (r2) {
			System.out.println("T2 locked r2");
			synchronized (r1) {
				System.out.println("T2 locked r1");
			}
		}
		
	}
}
public class DEADlock  {
	public static void main(String[] args) {
		String r1="Hello";
		String r2="Hi";
		new TT1(r1,r2).start();
		new TT2(r1,r2).start();
	}
}