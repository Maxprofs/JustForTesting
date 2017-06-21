package tw.joe.myproject;

import java.io.FileNotFoundException;

class TestResourceCloseable implements AutoCloseable{
	public void executeResource(){
		System.out.println("Execute Resources");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Resource Closed");
		
	}
}
public class TryWithResourcesAndCloseable {

	public static void main(String[] args) {
		try(TestResourceCloseable resource=new TestResourceCloseable()){
			resource.executeResource();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

}
