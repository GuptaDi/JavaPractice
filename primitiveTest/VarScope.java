class VarScope{
	int var1 = 10 ;  // instance variable

	/*	public void func1(){
		int var2 = 13;  // local variable
		func2();
	}
	public void func2(){
		System.out.println("Print the value of local variable of another function ="+ var2);
	}
	*/
	
	public void func3(){
		for(int i = 1; i <3 ; i++){
			boolean test = false;
			if(i == 2){
				test = true;
				break;
			}
		} 
		System.out.println("Print value for code block variable - test = "+test);
	}

	public static void main(String arg[]){
		int a = 20; // local variable
		// compile below line will give us error. Non static variable cannot be referenced from a static context
		// var1++;  // case 1 : trying to access instance variable
		
		/* This will give error : Cannot find the symbol */
		/*VarScope varObj = new VarScope();
		varObj.func1();
		*/
		
		/* This will give error :  Cannot find the symbol test */
		/*
		VarScope varObj2 = new VarScope();
		varObj2.func3();
		*/
	}
}