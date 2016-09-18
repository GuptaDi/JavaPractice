class Bird{
	static{
		System.out.println("Static of 1st block is called - Call 1");
	}
	{
		System.out.println("Initilization block -- 1");
	}
	static{
		System.out.println("Static of 1st class is called - Call 4");
	}
	Bird(){
		System.out.println("Constructor call -- 1 ");
	}
}

class Raptor extends Bird{
	static{
		System.out.println("Static of 2nd class is called - Call 2");
	}
	Raptor(){
		System.out.println("Constructor call -- 2 ");
	}
	{
		System.out.println("Initilization block -- 2");
	}
	static{
		System.out.println("Static of 2nd class is called - Call 3");
	}
	
}

public class StaticInitBlockPrint extends Raptor{
	public static void main(String arg[]){
			System.out.println("Main func initilization");
		new StaticInitBlockPrint();
		System.out.println("Main Func call 2");
	}
}