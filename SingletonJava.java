public class SingletonJava {
	int a=2;
	int b=3;
	int c=4;
	public String string;
	static SingletonJava instance;
	private SingletonJava(){
		string="vamsi";
		
	}
	public static SingletonJava getInstance() {
		if(instance==null) {
			instance=new SingletonJava();
		}
		return instance;
	}
}


