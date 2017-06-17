package method;
class Market{
	public void buy(int money){
		System.out.println("buys something spend"+money);
	}
}
public class ClassTestMethodEx3 {

	public static void main(String[] args) {
		Market supermarket = new Market();
		supermarket.buy(100);
		System.out.println("go home");

	}

}
