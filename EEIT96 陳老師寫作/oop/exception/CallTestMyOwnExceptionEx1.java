package tw.leonchen.myproject.oop.exception;

class MyOwnException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	private String server = "Avengers";
	private int port = 100;
	private String msg = "Secret";

	public MyOwnException(String server, int port, String msg){
		this.server = server;
		this.port = port;
		this.msg = msg;
	}
	
	public void showMsg(){
		System.out.println("server:" + server);
		System.out.println("port:" + port);
		System.out.println("msg:" + msg);
	}
}

public class CallTestMyOwnExceptionEx1 {

	public static void main(String[] args) {
        int keyCode = 001;
        
        if(keyCode%2!=0){
        	try {
				throw new MyOwnException("Blade", 8080, "Virus Attacked");
			} catch (MyOwnException e) {
				e.showMsg();
			}
        }else{
        	System.out.println("Welcome, My Friend.");
        }
	}

}
