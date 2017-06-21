package tw.joe.myproject;

public class Constructor {
	public void constr(String name){
		System.out.println("Hi "+name);
	}
	public void play(){
		System.out.println("Play basketball!");
	}
	

	public static void main(StringTest[] args) {
		Constructor construct=new Constructor();
		construct.constr("mike");
		construct.play();
		System.out.println("Finish");

	}

}
