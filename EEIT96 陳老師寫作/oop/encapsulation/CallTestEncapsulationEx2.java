package tw.leonchen.myproject.oop.encapsulation;

class AirCraft {
	private String name = "Hug";
	private int speed = 1000;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}

public class CallTestEncapsulationEx2 {

	public static void main(String[] args) {
		AirCraft a10 = new AirCraft(); 
		a10.setName("doggy");
		String name = a10.getName();
		System.out.println("name=" + name);
	}

}
