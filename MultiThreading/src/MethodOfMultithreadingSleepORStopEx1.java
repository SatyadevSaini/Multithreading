class AAA extends Thread {
	@Override
	public void run() {
		System.out.println("AA1");
		System.out.println("AA2");
		System.out.println("AA3");
		try {
			Thread.sleep(2000); //sleep method uses ...
		} catch (Exception e) {
			//this sleep method sleep this for 2 seconds  ||   till other methods run ....
		}
		System.out.println("AA4");   // they will run after 2 sec ....
		System.out.println("AA5");
		System.out.println("AA6");
	}
}
class BBB extends Thread {
	@Override
	public void run() {
		System.out.println("BBB1");
		System.out.println("BBB2");
		System.out.println("BBB3");
		System.out.println("BBB4");
		stop();                  // this method terminated this thread  (DEAD STATE ) from there 
		System.out.println("BBB41");
		System.out.println("BBB5");
		System.out.println("BBB6");
	}
}
public class MethodOfMultithreadingSleepORStopEx1 {

	public static void main(String[] args) {
	AAA a = new AAA();
	a.start();   // execute here  sleep method 2 secounds for non- runnable state here ...
	BBB b = new  BBB();
	b.start(); // execute  here stop() dead state  

	}

}
