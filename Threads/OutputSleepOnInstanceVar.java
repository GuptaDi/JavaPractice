
// Do we acctually need currentThread().
class SleepOnInstanceVar implements Runnable{
	int inst1;

	public void run(){
		for(int i = 0; i<400; i++){
			System.out.println(Thread.currentThread().getName()+ " is with "+i);
		}
	}
	
}
class OutputSleepOnInstanceVar{
	public static void main(String arg[]){
		SleepOnInstanceVar s1 = new SleepOnInstanceVar();
		
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s1);
			t1.setName("Debu");
			t2.setName("Kuchi");
			t1.start();
			t2.start();
	}
}