package tw.leonchen.myproject.oop.method;

class Action{
	public int f(int x){
		int value = 2*x+1;
		return value;
	}
}

public class CallTestMethodEx3 {

	public static void main(String[] args) {
		Action calValue = new Action();
		int num=calValue.f(6);
		System.out.println("num:" + num);
	}

}
