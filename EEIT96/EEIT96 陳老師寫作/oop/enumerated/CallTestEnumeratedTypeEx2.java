package tw.leonchen.myproject.oop.enumerated;

enum GameType{
	RPG, FirstPerson("Royal Clash"), VR, AR, Simulate;
	
	private String gameName = "Diablo III";
	
	private GameType(){
		System.out.println("Game Name:" + gameName);
	}
	
	GameType(String gameName){
		this.gameName = gameName;
	}
	
	public void magic(){
		System.out.println("Fire Ball and Flash:" + gameName);
	}
}

public class CallTestEnumeratedTypeEx2 {

	public static void main(String[] args) {
		GameType type = GameType.FirstPerson;
		type.magic();
	}

}
