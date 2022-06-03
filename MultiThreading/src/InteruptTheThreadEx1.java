class Thread12 extends Thread {
	@Override
	public void run() {
		System.out.println("hey Thread");
		try {
			sleep(20000);
		} catch (Exception e) {
			System.out.println("sleep method Intterput throw exception");
			System.out.println("kisne jagaye mujhe");
		}
		System.out.println("bye Thread");
	}
}
public class InteruptTheThreadEx1 {

	public static void main(String[] args) {
      
		Thread12 a = new Thread12();
		a.start();
        a.interrupt();
	}

}
