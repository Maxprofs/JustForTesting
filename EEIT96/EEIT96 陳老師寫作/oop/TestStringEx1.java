package tw.leonchen.myproject.oop;

public class TestStringEx1 {

	public static void main(String[] args) {
		String data = " abcdefghij ";
		
		System.out.println("data.charAt(5)=" + data.charAt(5));
		System.out.println("data.length()=" + data.length());
		System.out.println("data.substring(3, 5)=" + data.substring(3, 5));
		System.out.println("data.toUpperCase()=" + data.toUpperCase());
		
		System.out.println("data.trim().length()=" + data.trim().length());
		
		String value = data.trim();
		int length = value.length();
		System.out.println("length:" + length);
		
		int index1 = data.indexOf("f");
		System.out.println("index1=" + index1);
		
		int index2 = data.indexOf("fgi");
		System.out.println("index2=" + index2);
		
		String names = "mary-john-louis-johnny-jacky";
		String[] nickName = names.split("-");
		
		for(String firstName: nickName){
			System.out.println("firstName:" + firstName);
		}
		
	}

}
