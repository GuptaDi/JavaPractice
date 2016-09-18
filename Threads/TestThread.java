class MyRunnable implements Runnable{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(" Thread is running with Name "+Thread.currentThread().getName() + " -- Priority is " + Thread.currentThread().getPriority() + " i is - "+i);
			// Try catch code added here is just to provide symmetry
			// so that each thread can have its turn
			/*try{
				Thread.sleep(1000);
			}catch(InterruptedException ex){
				System.out.println(ex);
			}*/
		}
		System.out.println("***********************************");
	}
}

class TestThread{
	public static void main(String arg[]){
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		System.out.println(" My Thread name -- "+Thread.currentThread().getName() + " -- ID is ");
		Thread t2 = new Thread(mr);
		Thread t3 = new Thread(mr);
		
		t2.setName("Number2");
		t3.setName("Number3");
		
		/*try{
			Thread.sleep(1000);   sleep 
			
			always applies on the currently executing thread
		}catch(InterruptedException ex){  // This is a checked exception
			System.out.println(ex);
		}*/
		t.start(); // Till this point no name has been assigned to this thread
		t.setName("Number1");
		//t.join();
		t2.start();
		t3.start();
		
		//t2.join();
		//t.run();
		//t2.run();
	}
}