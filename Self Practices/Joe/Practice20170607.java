package tw.joe.myproject;

public class Practice20170607 {

	public static void main(StringTest[] args) {
		int a=-2;
		int b=5;
		int c=-1;
		double p=b*b-4*a*c;
		double p1= Math.sqrt(p);
		if(p>0){
			System.out.println("x 有兩條相異實根， "+ "x= "+ ((-b+p1)/2*a) +" 或 "+ ((-b-p1)/2*a));
		}else if(p==0){
			System.out.println("x有兩條相等實根， x= " +(-b/2*a));
		}else{
			System.out.println("x無實根");
		}
	}

}
