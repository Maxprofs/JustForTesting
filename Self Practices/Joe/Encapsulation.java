package tw.joe.myproject;

public class Encapsulation {

	private String name="AK-47";
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public static void main(String[] args) {
		Encapsulation nameChange=new Encapsulation();
		nameChange.setName("K2");
		String result=nameChange.getName();
		System.out.println("Result="+result);
	}

}
