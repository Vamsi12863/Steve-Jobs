class SingleTon1{
	public static void main(String [] inputs) {
		SingletonJava st=SingletonJava.getInstance();
		System.out.println(st.string);
		System.out.println(st.a);
	}
}