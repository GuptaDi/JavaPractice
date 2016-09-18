class StringBuff{
	public static void main(String arg[]){
		String s1 = new String("Ramya");
		char ch = s1.charAt(1);
		int x = s1.compareTo("ramya");
		// cant do. compareTo returns an integer
		// boolean y = s1.compareTo("ramya");
		StringBuffer sb = new StringBuffer("Ramya");
		sb = sb.append(" how are you?");
		sb = sb.delete(6,9);
		sb = sb.insert(6,"how");
		
		System.out.println(" The string buffer value --- "+ sb);
		System.out.println("The x value --- "+ x);
		System.out.println("The y value --- "+ y);
	
	}
}