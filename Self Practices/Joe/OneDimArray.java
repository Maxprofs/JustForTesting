package tw.joe.myproject;

public class OneDimArray {

	public static void main(String[] args) {
		/*int[] data=new int[3];
		data[0]=1;
		data[1]=2;
		//data[2]=3;
		System.out.println("data[0]= "+data[0]);
		System.out.println("data[1]= "+data[1]);
		System.out.println("data[2]= "+data[2]);
		*/
		int[]data1={1,2,3,4,5,6};
		for(int i=0;i<data1.length;i++){
			System.out.printf("data[%d]=%d\n",i,data1[i]);
		}
	}

}
