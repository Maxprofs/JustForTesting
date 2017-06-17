package hw;

public class TestLotteryNumber {
private int[] count = new int[42];
private int[] number =  new int[42]; 
		
public void createLotteryNumber(){
	for(int i =1;i<=100000;i++){
		int num =(int)(Math.random()*42+1);
		count[num-1]++;
	}
	for(int j=1;j<=count.length;j++){
		number[j-1]=j;
	}
}
public void numberSort1(){
	for(int i=0;i<count.length-1;i++)
	{
		for(int j =i+j;j<count.length;j++){
			int temp1 =0,temp2 =0;
			if(count[i]<count[j]){
				temp1 = count[i];
				count[i] =count[j];
				count[j] =temp1;
				
				temp2 = count[i];
				count[i] = count[j];
				count[j] = temp2;
				
			}
		}
	}
}


public void printResult(){
	for(int m =0;m<count.length;m++){
			System.out.printf("%2d:%d\t",number[m],count[m]);
	if((m+1)%7==0){
		System.out.println();
	}
	}
}

public static void main(String[] args){
TestLotteryNumber lotto = new TestLotteryNumber();
lotto.createLotteryNumber();
System.out.println("orginal date");
System.out.println("sort date");
lotto.numberSort1();
lotto.printResult();
}
}

