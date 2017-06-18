package Overload;

public class TestOverLoad {
public void move(){
System.out.println("move");

}
public void move(int speed){
	System.out.print("move"+speed+"km");

}
public boolean move(String destination, int distance){
	System.out.println("Dest:"+destination+"Distance"+distance+"km");
	return true;
}
	public static void main(String[] args) {
	TestOverLoad overload1 = new TestOverLoad();
overload1.move('A');
	}

}
