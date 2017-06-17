package Exception;

public abstract class TestExceptionEx1 {

	public static void main(String[] args) {
		int data[] ={1,2,3,4,5,6};
		try{
			for(int i =0;i<=data.length;i++){
				System.out.println("data["+i+"]="+data[i]);
			
		catch(ArithmeticException e){
			System.out.println("hello1");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("e:"+e);
			System.exit(-1);
			e.printStackTrace();
		}  
		catch(Exception e){
			System.out.println("hello2");
			
		}
		finally{
			System.out.println("always run here");
		}
		
	System.out.println("finished");
	}
