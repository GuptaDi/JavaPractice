class PrePost{
	public static void main(String arg[]){
		/**
		The output of both the operator are same when used in a for loop like below
		*/
		System.out.println("Postfix operator output");
		for(int i =0; i<5; i++){
			System.out.println(" the Value of i "+i);
		}
		System.out.println("**************************");
		System.out.println("Prefix operator output");
		for(int i =0; i<5; ++i){
			System.out.println("The Value of i "+i);
		}
	}
}