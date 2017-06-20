package tw.leonchen.myproject.oop.enumerated;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

enum PokerGame{
	spade, heart, diamond, club
}

public class CallTestEnumeratedTypeEx1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		PokerGame suit = PokerGame.heart;
		
		switch(suit){
		   case spade:
			   System.out.println(PokerGame.spade);
			   break;
		   case heart:
			   System.out.println(PokerGame.heart);
			   break;
		   case diamond:
			   System.out.println(PokerGame.diamond);
			   break;
		   case club:
			   System.out.println(PokerGame.club);
			   break;
		   default:
			   assert false;   
		}
		
		PokerGame[] suitName = PokerGame.values();
		
		for(PokerGame poker: suitName){
			System.out.println(poker + ":" + poker.ordinal());
		}		

	}

}
