package tw.leonchen.myproject.oop;

class Safe{
	
	private String systemUserName = "jack";
	private String systemPwd = "test123";
	
	public boolean verify(String userName, String password){
		
		if(systemUserName.equals(userName) && systemPwd.equals(password)){
			return true;
		}
		
		return false;
	}
}

public class CallTestAuthorizedEx1 {

	public static void main(String[] args) {
		Safe mySafe = new Safe();
		boolean status = mySafe.verify("jack123", "test123");
		System.out.println("status:" + status);
		
		if(status){
			System.out.println("Welcome.");
		}else{
			System.out.println("Bye Bye.");
		}
	}

}
