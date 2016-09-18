public class Ques5{
	public static void main(String arg[]){
		System.out.print(" 1 ");
		synchronized(arg){
			System.out.print(" 2 ");
			try{
				arg.wait();
			}catch(InterruptedException ex){}
		}
		System.out.print(" 3 ");
	}
}