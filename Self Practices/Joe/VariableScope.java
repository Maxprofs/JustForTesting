package tw.joe.myproject;

public class VariableScope {
	int a=1;
	static int b=2;
	public void f1(int c){
		int d=4;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);
		System.out.println("d= "+d);
		f2(6);
	}
	public static void f2(int e){
		//System.out.println("a= " +a); //compile error
		System.out.println("b= " +b);
		//System.out.println("c= " +c);//compile error
		//System.out.println("d= " +d);//compile error
		System.out.println("e= " +e);
		//f1(4); //compile error
		
	}
	public static void main(StringTest[] args) {
		VariableScope scope=new VariableScope();
		scope.f1(3);

	}

}
