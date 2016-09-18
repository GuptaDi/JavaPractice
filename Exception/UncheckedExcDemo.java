public class UncheckedExcDemo{
	public static void display(){
		System.out.println("Inside display");
		new ArithmeticException();
	}
	public static void main(String[] arg){
		display();
		System.out.println(" Inside main");
	}
}