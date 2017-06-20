package tw.leonchen.myproject.oop.collections.generics;

//class TestInteger{
//	private Integer i1;
//
//	public Integer getI1() {
//		return i1;
//	}
//
//	public void setI1(Integer i1) {
//		this.i1 = i1;
//	}
//}
//
//class TestDouble{
//	private Double d1;
//
//	public Double getD1() {
//		return d1;
//	}
//
//	public void setD1(Double d1) {
//		this.d1 = d1;
//	}
//}
//
////...
//
//class TestObject{
//	private Object o1;
//
//	public Object getO1() {
//		return o1;
//	}
//
//	public void setO1(Object o1) {
//		this.o1 = o1;
//	}
//}

class TestGenerics<T>{
	private T t1;

	public T getT1() {
		return t1;
	}

	public void setT1(T t1) {
		this.t1 = t1;
	}
}

public class CallTestGenericsEx1 {

	public static void main(String[] args) {
//		TestInteger test1 = new TestInteger();
//		test1.setI1(6);
//		int num1 = test1.getI1();
//		System.out.println("num1+1=" + (num1+1));
//		
//		TestObject o1 = new TestObject(); 
//		o1.setO1(7);
//		int num2 = (Integer)o1.getO1();
//		System.out.println("num2+2=" + (num2+2));
		
		TestGenerics<Integer> test2 = new TestGenerics<Integer>();
		test2.setT1(12);
		int num3 = test2.getT1();
		System.out.println("num3+3=" + (num3+3));
		
		TestGenerics<Double> test3 = new TestGenerics<Double>();
		test3.setT1(3.14);
		double pi = test3.getT1();
		System.out.println("pi*10*10=" + (pi*10*10));
	}

}
