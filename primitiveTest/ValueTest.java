class ValueTest {
	public static void main(String args[]){
		int a = 10;
		System.out.println(" A = "+a);
		int b = a;
		b = 30;
		System.out.println("A = "+a + " after b change");
		a = 20;
		b = a;
		a = 40 ;
		System.out.println(" Change the value of a, assign it to b and change a again. Then print b = "+b);
	}
}