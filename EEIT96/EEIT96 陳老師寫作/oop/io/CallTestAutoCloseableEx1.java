package tw.leonchen.myproject.oop.io;

class MyAutoCloseableEx1 implements AutoCloseable{
	
	public void processResource(){
		System.out.println("Process Resources.");
	}

	@Override
	public void close() throws Exception {
        System.out.println("Resources Closed.");		
	}
	
}

public class CallTestAutoCloseableEx1 {

	public static void main(String[] args) {
        try(MyAutoCloseableEx1 test1 = new MyAutoCloseableEx1()){
        	test1.processResource();
        } catch (Exception e) {
			e.printStackTrace();
		}
	}

}
