import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo{
	public static void main(String arg[]){
	Map<Integer,String> map = new HashMap<Integer,String>();
	map.put(1,"A");
	map.put(2,"B");
	map.put(4,"D");
	map.put(3,"C");
	Collection<String> collection = map.values();
	for(String element : collection){
		System.out.println(element);
	}

	//Map<Integer,String> map2 = new HashMap<Integer,String>();
	
	}
}