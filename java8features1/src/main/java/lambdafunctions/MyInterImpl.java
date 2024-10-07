package lambdafunctions;

public class MyInterImpl {

	/*
	 * MyInter i = new MyInter() {
	 * 
	 * @Override public void sayHello() { // TODO Auto-generated method stub
	 * 
	 * } };
	 */
	public static void main(String[] args) {
		

	MyInter i =()->{
		System.out.println("this is body");
	};
	}
	
}
