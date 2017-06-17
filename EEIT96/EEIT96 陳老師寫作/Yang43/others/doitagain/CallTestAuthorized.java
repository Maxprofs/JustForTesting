package doitagain;
class Safe
{
	private String systemUserName ="Jack";
	private String systemPwd ="test123";
	public boolean verify(String userName,String password){
		if(systemUserName.equals(userName)&&systemPwd.equals(password)){
			return true;
		}
		return false;
	}
}
public class CallTestAuthorized {

	public static void main(String[] args) {
		Safe mySafe = new Safe();
		boolean status = mySafe.verify("jack123","test123");
System.out.println("status:"+status);
if(status){
	System.out.println("welcome");
}
else{
	System.out.println("byebye");
}
	}

}
