public class TestGenericMethods{
	public static <E> void displayArray(E[] inputArray){
		for(E element : inputArray){
			System.out.printf("%s",element);
			System.out.println();
		}
	}
	public static void main(String arg[]){
		Integer[] array = {10,20,30,40,50,60};
		System.out.println(" The array contains : ");
		displayArray(array);
	}
}