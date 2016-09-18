class DefaultValue {
	private String title;
	private String authNName = "";
	
	public String getTitle(){
		return title;
	}
	
	public String getAuth(){
		return authNName;
	}
	
	public static void main(String arg[]){
		DefaultValue objDV = new DefaultValue();
		// No value Default value is assigned to the object reference. 
		// It compiles fine but when applied other functions on it., it throws exception at runtime
		String r = objDV.getTitle();
		System.out.println("The title of book , no value is assigned to the title --- "+ r);
		System.out.println("The title of book , added some extra function on top of value --- "+ r.toLowerCase()); // Null pointer exception
		
		String s = objDV.getAuth();
		System.out.println("The author of the book, an empty value is assigned to the author ---- "+s);
		System.out.println("The author of the book,extra functions on top of value---- "+s.toLowerCase());	
		
	}

}