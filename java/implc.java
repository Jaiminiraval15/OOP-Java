interface baseI{
	void method(); 
}
class basec{
	public void method(){
		System.out.println("inside......");
	}
}
class implc extends basec implements baseI{
	public static void main(String[] s){
		(new implc()).method();
	}
}