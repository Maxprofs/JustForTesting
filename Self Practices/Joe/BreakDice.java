package tw.joe.myproject;

public class BreakDice {

	public static void main() {
		int yournum=3;
		int count=0;
		while(true){
			int luckynum=(int) (Math.random()*6+1);
			System.out.println(luckynum);
			if(yournum==luckynum){
				count++;
				if(count==2){
					System.out.println("You Win!");
					break;	
				}
			}else if(luckynum!=yournum){
				System.out.println("Try Again~");
			}
		}
	}
	public static void main(StringTest[] args){
		int i,j;
		action:
			for(i=1;i<=3;i++){
				for(j=1;j<=5;j++){
					if(i==2 && j==4){
						break action;
						//continue action;
					}
					System.out.printf("i=%d j=%d\n",i,j);
				}
			}
	}
}
