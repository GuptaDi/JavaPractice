class TestSync extends Thread{
	
	private StringBuffer ssb;
	
	TestSync(StringBuffer sb){
		this.ssb = sb;
	}
	
	public void run()
	{
		System.out.println("Test ");
		synchronized(this){
			System.out.println("Synchronized ---- "+ this.ssb.toString());
			
		}
	}
	
	public static void main(String arg[]){
		TestSync ts = new TestSync();
		Thread one = new Thread(ts);
		Thread two = new Thread(ts);
		Thread three = new Thread(ts);
		StringBuffer sb = new StringBuffer("A");
		one.start();
		two.start();
		three.start();
		
	}
}