package tw.leonchen.myproject.oop;

public class TestEqualsEx2 {

	public static void main(String[] args) {
		String str1 = new String("Hello");
        String str2 = new String("hello");
        
        System.out.println("(str1==str2)=" + (str1==str2));
        System.out.println("str1.equals(str2)=" + (str1.equals(str2)));
        System.out.println("str1.equalsIgnoreCase(str2)=" + (str1.equalsIgnoreCase(str2)));
	}

}
