package tw.joe.myproject;

class MazeGame {
private String[][] field={{"","","","","Wild Dog appeared"},{"","Healed","","",""},{"","","","Get a stone",""},{"Wild Cat appeared","","","",""},{"","","Get a potion","",""}};
	private int x = 0, y = 0;

	public void move(int x, int y) {
		synchronized (this) {
			this.x = x;
			this.y = y;
			System.out.println("x: "+x+" y: "+ y+" "+field[x][y]);
			this.notify();
		}
	}

	public void checkExit() {
		synchronized (this) {
			try {
				this.wait();
				if (x == 0 && y == 0) {
					System.out.println("Game Over");
					System.exit(-1);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Hero implements Runnable {
	private MazeGame core;
	public Hero(MazeGame core) {
		this.core = core;
	}

	@Override
	public void run() {
		while (true) {
			int x = (int) (Math.random() * 5);
			int y = (int) (Math.random() * 5);
			core.move(x, y);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
class MazeGameCheck implements Runnable{
	private MazeGame core;
	public MazeGameCheck(MazeGame core){
		this.core=core;
	}
	@Override
	public void run() {
		while(true){
			core.checkExit();
		}
		
	}
}
public class ThreadSynchronizedAndWaitNotify {
	public static void main(String[] args) {
		MazeGame core = new MazeGame();
		
		Hero batMan = new Hero(core);
		Thread thread1 = new Thread(batMan);
		thread1.start();

		MazeGameCheck check=new MazeGameCheck(core);
		Thread thread2=new Thread(check);
		thread2.start();
	}
}
