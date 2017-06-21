package tw.joe.myproject;
public class StringTest {
public void string1(){
	String str1="zxcvbnm";
	char A=str1.charAt(5);
	int B=str1.length();
	String C=str1.substring(2, 5);
	String D=str1.substring(4);
	int E=str1.indexOf('v');
	System.out.printf("CharAt: 5= %c\n length= %d\n String 2~5: %s\n String 4+: %s\n indexOf: v =%d\n",A,B,C,D,E);
}
public void string2(){
	String names="mary-john-james-keef";
	String [] nickname=names.split("-");
	for(String firstname:nickname){
		System.out.println("Name: "+firstname);	
		
	}
	
}
	public static void main(String[] args) {
		StringTest stringTest= new StringTest();
		stringTest.string1();
		stringTest.string2();

	}

}
