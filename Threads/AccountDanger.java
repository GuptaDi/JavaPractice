class Account{
/* This is a problem which shows a need of synchronization
*/
	private int balance = 50;
	public void setBalance(int balance){
			this.balance = balance;
	}
	public int getBalance(){
		return this.balance;
	}
	public void withdraw(int amount){
		this.balance = this.balance - amount;
	}
}

public class AccountDanger implements Runnable{
	private Account acct = new Account();
	public static void main(String arg[]){
		AccountDanger ad = new AccountDanger();
		Thread one = new Thread(ad);
		Thread two = new Thread(ad);
		
		one.setName("Fred");
		two.setName("Lucky");
		
		one.start();
		two.start();
	}
	public void run(){
		for(int x=0; x<5;x++){
			makeWithdrawal(10);
			if(acct.getBalance() <0){
				System.out.println("account is overdrawn");
			}
		}
	}
	
	private void makeWithdrawal(int amt){
		if( acct.getBalance() >= amt ){
			System.out.println(Thread.currentThread().getName() + " is going to withdraw");
			try{
				Thread.sleep(500);
			}catch(InterruptedException ex){}
				acct.withdraw(amt);
				System.out.println(Thread.currentThread().getName() + " completes the withdrawal and now the balance is -- "+acct.getBalance() );
			
		}else{
			System.out.println("Not enough in account for "+ Thread.currentThread().getName() + " to withdraw "+ acct.getBalance());
		}
	}
}