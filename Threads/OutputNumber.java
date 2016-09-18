// way 1 : check with 2 classes
/*class OutputString extends Thread{
	public void run(){
		for(int i=1;i<=100;i++){
			if(i%10 == 0){
				System.out.println("I value = "+i);
			}
		try{
		sleep(1000);
		}catch(InterruptedException e){
			System.out.println("EX : "+ e);
		}
		}
	}
}

class OutputNumber{
	public static void main(String arg[]){
		OutputString t1 = new OutputString();
			t1.start();
		
	}
}

*/
// way 2 : by using 1 class
class OutputNumber extends Thread{
	public void run(){
		for(int i=1;i<=100;i++){
			if(i%10 == 0){
				System.out.println("I value = "+i);
			}
		try{
		Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("EX : "+ e);
		}
		}
	}
	public static void main(String arg[]){
		Thread t1 = new Thread();
			t1.start();
	}	
}