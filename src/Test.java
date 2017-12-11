public class Test {

	public static void main(String[] args) throws InterruptedException {
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
		
		t1.start();
		t2.start();

		t1.join();
		t2.join();
		
		System.out.println("finish");
	}
}
