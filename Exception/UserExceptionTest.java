class InvalidAmount extends Exception{
	public InvalidAmount(){
		super("Invalid Amount");
	}
	public InvalidAmount(String msg){
		super(msg);
	}
}
public class UserExceptionTest{
	public static void main(String arg[]){
		int amount = -1;
		try{
			if(amount <= 0){
				throw new InvalidAmount("Amount is not valid");
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}