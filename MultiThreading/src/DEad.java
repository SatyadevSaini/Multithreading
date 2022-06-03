class T1 extends  Thread {
	String s1 ,s2;
	public T1(String s1 , String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override
	public void run() {
		synchronized (s1) {
			System.out.println("t1 lock s1");
			synchronized (s2) {
				System.out.println("T2 lock s2");
			}
		}
	}
}
class T2 extends  Thread {
	String s1 ,s2;
	public T2(String s1 , String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override
	public void run() {
		synchronized (s2) {
			System.out.println("t2 lock s2");
			synchronized (s1) {
				System.out.println("T2 lock s1");
			}
		}
	}
}
public class DEad {

	public static void main(String[] args) {
		String s1 = "Hey";
		String s2 = "Hello";
		new T1(s1, s2).start();
		new T2(s1, s2).start();

	}

}
