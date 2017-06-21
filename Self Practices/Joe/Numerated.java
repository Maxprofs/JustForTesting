package tw.joe.myproject;
enum PokerGame{
			Spade,Heart,Diamond,Club
		}
public class Numerated {

	public static void main(String[] args) {
		PokerGame match=PokerGame.Heart;
		switch(match){
		case Spade:
			System.out.println(PokerGame.Spade);
			break;
		case Heart:
			System.out.println(PokerGame.Heart);
			break;
		case Diamond:
			System.out.println(PokerGame.Diamond);
			break;
		case Club:
			System.out.println(PokerGame.Club);
			break;
		default:
		assert false;
		}
PokerGame [] poker=PokerGame.values();
for(PokerGame Poker:poker){
	System.out.println(Poker +" : "+Poker.ordinal());
}
	}

}
