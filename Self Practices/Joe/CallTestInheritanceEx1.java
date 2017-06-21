package tw.joe.myproject;
class Employee{
	String name = "mary";
	String address = "Taiwan";
	String phone = "0987654321";
	int salary = 22000;
	
	public Employee(){		
	}
	
	public Employee(String name){
		this.name = name;
	}
	
	public void showDetails(){
		System.out.println("Personal Info");
	}
	
	public int getSalary(){
		return salary;
	}
}

class Engineer extends Employee{
	String skill = "Java";

	
//	public Engineer(){
//		super("john");
//	}
	
	public void program(){
		System.out.println("I can write " + skill + ".");
		super.showDetails();
	}
}


public class CallTestInheritanceEx1 {

	public static void main(String[] args) {
		Engineer softwareEngineer = new Engineer();
		//softwareEngineer.salary = 35000;
		//softwareEngineer.showDetails();
		softwareEngineer.program();
		//System.out.println(softwareEngineer.getSalary());
	}

}
