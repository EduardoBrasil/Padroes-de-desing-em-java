package singleton;

public class SingleObject {
	
	//cria um objeto de single object 
	private static SingleObject instance = new SingleObject();
	
	private SingleObject(){
		
	}
	
	public static SingleObject getInstance(){
		return instance;
	}
	
	public void showMessage(){
		System.out.println("Singleton ");
	}

}
