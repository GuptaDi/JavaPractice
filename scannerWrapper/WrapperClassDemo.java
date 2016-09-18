public class WrapperClassDemo{
	public static void main(String arg[]){
		WrapperUsage obj = new WrapperUsage();
		obj.fn_Wrapper();
	}
}

class WrapperUsage{
	void fn_Wrapper(){
		int i_var1 = 23;
Integer w_obj = new Integer(i_var1);
int i_var2 = w_obj.intValue();
System.out.println(" Value Before : "+ i_var1 + "\n Value after : "+i_var2);
	}
	
	
}