package tw.joe.myproject;
class Bird{
	String name="Noob";
	public void msg(){
		System.out.println("Im a blue bird");
	}
	public void name1(String name){
		this.name=name;
		msg();
		System.out.println("My name is: "+ name);
	}
}
public class ThisEx2 {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.name1("Fisher");;
		
	}

}
