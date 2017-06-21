package tw.joe.myproject;

public class While {
	/*
	 * public static void main() { int i=1; int sum=0; while(i<=100){ sum=sum+i;
	 * System.out.println("NOOB "+i+'\n' +sum); i++; }
	 * 
	 * } public static void main(){ int j=0; while(j<=3){ int i=1; while(i<=10){
	 * int k=0; while(k<=3){ System.out.print("Noob"); k++; }
	 * System.out.print("@#$"); i++; } System.out.println(); j++; } }
	 */
	public static void main(StringTest[] args) {
		int a = 1;
		while (a <= 9) {
			int b = 1;
			while (b <= 9) {
				System.out.printf("%dx%d=%2d\t", a, b, (a * b));
				b++;
			}
		System.out.println();
		a++;
		}
	}
}
