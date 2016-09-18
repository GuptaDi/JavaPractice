public class MethodOverriding{
	public static void main(String arg[]){
		superClass obj = new superClass();
		obj.fn_override(9);
	
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		//sub class object
		subClass obj1 = new subClass();
		obj1.fn_override(2);
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		//superclass reference
		superClass obj2 = new subClass();
		obj2.fn_override(7);
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		// Illegal usage : subclass reference , superclass obj
		// subclass obj3 = new superClass();
			// obj3.fn_override(8);
	}
}

class superClass{ 
	//Constructor
	superClass(){
		System.out.println("SuperClass : Inside default constructor");
	}
	superClass(int i_var1){
		System.out.println("SuperClass : Inside parameterized constructor" + i_var1);
	}
	// Methood
	void fn_override(int i_var2){
		System.out.println("Super class : Inside function : "+ i_var2);
	}
}

class subClass extends superClass{ 
	//Constructor
	subClass(){
		super(8);
		System.out.println("subClass : Inside default constructor");
	}
	// @Override
	// Methood
	void fn_override(int i_var2){
		System.out.println("subClass : Inside function : "+ i_var2);
	}
}
