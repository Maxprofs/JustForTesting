package tw.leonchen.myproject.oop.nestedclass;

class Bank{
	private int account = 10000;
	
	public void withdraw(int money){
		account = account - money;
	}
	
	public void deposit(int money){
		account = account + money;
	}
}
//
//class BigTreeBank extends Bank{
//    private int account = 5000;
//	
//	@Override
//	public void withdraw(int money) {
//		account = account - money*2;
//	}
//
//	@Override
//	public void deposit(int money) {
//		account = account + (money/2);
//	}
//	
//	public int getAccount(){
//		return account;
//	}
//	
//}

public class CallTestNestedClassEx4 {

	public static void main(String[] args) {
//		BigTreeBank treeBank = new BigTreeBank(); 
//		treeBank.withdraw(1000);
//		treeBank.deposit(1000);
//		int myAccount = treeBank.getAccount();
//		System.out.println("myAccount:" + myAccount);
		
		new Bank(){

			private int myTrapAccount = 20000;
			
			@Override
			public void withdraw(int money) {
				myTrapAccount = myTrapAccount - (money/2); 
			}

			@Override
			public void deposit(int money) {
				myTrapAccount = myTrapAccount + money*2;
				System.out.println("myTrapAccount:" + myTrapAccount);
			}
			
		}.deposit(1000);
		
//		Bank myBank = new Bank(){
//
//			private int myTrapAccount = 20000;
//			
//			@Override
//			public void withdraw(int money) {
//				myTrapAccount = myTrapAccount - (money/2); 
//			}
//
//			@Override
//			public void deposit(int money) {
//				myTrapAccount = myTrapAccount + money*2;
//				System.out.println("myTrapAccount:" + myTrapAccount);
//			}
//			
//		};
//		
//		myBank.deposit(5000);
	}

}
