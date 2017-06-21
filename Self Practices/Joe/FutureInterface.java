package tw.joe.myproject;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class ChooseName implements Callable<String>{
	String[]names={"John","Mary","Ian","Michelle"};
	public String call() throws Exception{
		int index=(int)(Math.random()*names.length);
		String nickname=names[index];
		System.out.println("New Name: "+nickname+"\nTime: "+new Date());
		return nickname;
	}
}
public class FutureInterface {
	public static void main(String[] args) throws Exception{
		System.out.println("Get me a lucky name~");
		FutureTask<String> futureTask=new FutureTask<>(new ChooseName());
		Thread thread=new Thread(futureTask);
		thread.start();
		System.out.println("Please wait while we fetch a name");
		System.out.println("Here is your new name: "+futureTask.get());
	}

}
