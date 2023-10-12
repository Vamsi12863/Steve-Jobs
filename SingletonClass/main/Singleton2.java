package singletonClass.main;

public class Singleton2 {
	int a=2;
	int b=3;
	int c=4;
	public String string;
	static Singleton2 instance;
	private Singleton2(){
		string="vamsi";
		
	}
	public static Singleton2 getInstance() {
		if(instance==null) {
			instance=new Singleton2();
		}
		return instance;
	}
}


