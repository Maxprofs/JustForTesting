package Exception;

public class CallTestMyOwnExceptionEx1 {
	private static final long serialVersionUID = 1L;
	private String server = "Avengers";
	private int port = 100;
	private String msg = "Secret";

	public void MyOwnException(String server, int port, String msg) {
		this.server = server;
		this.port = port;
		this.msg = msg;

	}

	public void showMsg() {
		System.out.println("server:" + server);
		System.out.println("port:" + port);
		System.out.println("msg:" + msg);
	}

	public class CallTestMyOwnExceptionEx1 {
		public static void main(String[] args){
			int keycode =001;
			if(keycode%2!=0){
				throw new MyOwnException("Blade","8080","Virus Attacked");
			} catch (MyOwenException e){
				e.showMsg();
			}else{
				System.out.println("welcome my friend")
			}
			
		}
	}

	public static void main(String[] args) {

	}

}
