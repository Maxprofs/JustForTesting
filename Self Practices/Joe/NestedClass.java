package tw.joe.myproject;

class Bank {
	private int account = 1000;

	public void withdraw(int output) {
		account = account - output;
	}

	public void deposit(int input) {
		account = account + input;
	}

	public int getBalance() {
		return account;
	}
}

class E {
	private String career = "Sports atheletes";

	public void E() {
		int age = 18;
		class F {
			public void greetings() {
				System.out.println("Good day!");
			}

			public void run() {
				greetings();
				System.out.println(career + " run at the age of " + age);
			}
		}
		F f1 = new F();
		f1.run();
	}
}

class C {
	public static String name = "Dota";

	static class D {
		public void play() {
			System.out.println("Play " + name);
		}
	}
}

class A {
	String name = "mary";

	class B {
		public void sleep() {
			System.out.println("Sleep " + name);
		}
	}
}

public class NestedClass {
	public static void main(String[] args) {
		A a1 = new A();
		A.B Sleep = a1.new B();
		Sleep.sleep();
		C.D Play = new C.D();
		Play.play();
		E e1 = new E();
		e1.E();

		new Bank() {
			private int myAccount = 20000;

			@Override
			public void withdraw(int output) {
				myAccount = myAccount - output;
				System.out.println("My Balance: " + myAccount);
			}

			@Override
			public void deposit(int input) {
				myAccount = myAccount + input;
				System.out.println("Balance: " + myAccount);

			}
		}.deposit(2000);
		
		Bank myBank=new Bank(){
			private int myAccount1=10000;
			@Override
			public void withdraw(int output){
				myAccount1=myAccount1-output;
				System.out.println("My Balance: "+myAccount1);
			}
			public void deposit(int input){
				myAccount1=myAccount1+input;
				System.out.println("My Balance: "+myAccount1);
			}
			public int getBalance(){
				return myAccount1;
			}
		}; 
		myBank.withdraw(5000); 
		myBank.getBalance();
	}
}