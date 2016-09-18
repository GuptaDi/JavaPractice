class camelCaseTest{
	public void testFunc(){
		System.out.println("This is wrong way of defining the class. It should be --  CamelCaseTest");
	}
	public static void main(String arg[]){
		new camelCaseTest().testFunc();
	}
}