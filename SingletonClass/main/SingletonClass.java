package SingletonClass.main;



public class SingletonClass {
	int a=2;
	int b=3;
	int c=4;
	public String string;
	static SingletonClass instance;
	private SingletonClass(){
		string="vamsi";
		
	
}
	public static SingletonClass getInstance() {
		if(instance==null) {
			instance=new SingletonClass();
		}
		return instance;
	}
}
