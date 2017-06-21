package tw.joe.myproject;

class ProcessAction implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+":" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		ProcessAction processAction=new ProcessAction();
		Thread thread=new Thread(processAction,"A");
		Thread thread1=new Thread(processAction, "B");
		thread.start();
		thread1.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("C");

	}

}
