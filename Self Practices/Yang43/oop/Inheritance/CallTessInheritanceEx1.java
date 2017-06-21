package Inheritance;

class Employee {
	String name = "mary";
	String address = "Taiwan";
	String phone = "0948949894";
	int salary = 22000;
	public Employee(String name){
   this.name = name;
   
	}
	public void showDetails(){
		System.out.println("Personal Info");
	}
	public int getsalary(){
		return salary;
	}
}
class Engineer extends Employee{
	String skill ="Java";
	public Engineer(){
		super("john");
	}
	public void program(){
		System.out.println("I can write"+skill+".");
	}
	
}
public class CallTessInheritanceEx1 {

	public static void main(String[] args) {
Engineer softwareEngineer = new Engineer();
softwareEngineer.program();
	}

}
