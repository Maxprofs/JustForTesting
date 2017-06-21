package tw.joe.myproject;

/**
 * 
 * @author Joe
 * @version 1.8 如果要在javadoc上印出中文，要在javadoc最後一頁的VM裏加-encoding UTF-8
 *          然後用瀏覽器開啓並改編碼為UTF-8就可以看到中文了
 *
 */
public class Test20170607 {

	/**
	 * 
	 * @param args
	 *            This explains my entry point
	 */
/*
	public static void main(String[] args) {
		boolean b1 = true;
		char ch1 = 'A';
		char ch2 = '\u03A6';
		char ch3 = 97;
		char ch4 = '\u03C6';
		char ch5 = '\t';
		float pi = 3.14f;
		int num = '7';

		System.out.println("b1=\n" + b1);
		System.out.println("ch1=" + ch1);
		System.out.println("ch2=" + ch2);
		System.out.println("ch3=" + ch3);
		System.out.println("ch4=" + ch4);
		System.out.println("ch5=" + ch5);
		System.out.println("pi=" + pi);
		System.out.println("num=" + num);
	}

	public void final1() {
		final double pi = 3.14; // pi value cannot be changed, with FINAL its
								// fixed.
		System.out.println("pi=" + pi);
	}
*/
	//Operator
	public static void main(StringTest[] args) {
		int i = 1, j;
		j = i++;
		// j=++i;
		System.out.println("i=" + i + '\n' + "j=" + j);
		int a = 1, b = 2, c;
		c = (a++) + (++b);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);

		// Conditional Operator
		int aa = 1, bb = 2, cc;
		cc = (aa++) + (bb++);
		System.out.println("aa=" + aa);
		System.out.println("bb=" + bb);
		System.out.println("cc=" + cc);

		// Bitwise Logical Operator
		System.out.println("~2=" + (~2));
		System.out.println("2&3=" + (2 & 3));
		System.out.println("2|3=" + (2 | 3));
		System.out.println("2^3=" + (2 ^ 3));
		/*
		 * a = 0011 1100 b = 0000 1101 ----------------- a&b = 0000 1100 a|b =
		 * 0011 1101 a^b = 0011 0001 ~a = 1100 0011
		 */

		// Shift Operator
		int x = 1234, y = -1234;
		System.out.println(x + ">>2=" + (x >> 2));
		System.out.println(y + ">>2=" + (y >> 2));
		System.out.println(y + ">>>2=" + (y >>> 2));
		System.out.println(y + ">>>2=" + (y >>> 2));
		System.out.println(y + "<<2=" + (y << 2));
		System.out.println(y + "<<2=" + (y << 2));

		// Type Casting (Convert Type)
		byte b1 = 1, b2 = 2;
		int b3;
		b3 = (byte) b1 + b2;
		System.out.println("b1=" + b1);
		System.out.println("b2=" + b2);
		System.out.println("b3=" + b3);
	}
}
