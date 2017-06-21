package tw.joe.myproject;
class Market{
	public void buy(int money){
		System.out.println("Buy something & pay "+money);
	}
}
public class Method {
	
	public static void main(StringTest[] args) {
		Market superMarket=new Market();
		superMarket.buy(100);
	}

}
