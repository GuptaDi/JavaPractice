import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class LinkedHashMapDemo{
	public static void main(String arg[]){
	Map<Integer,String> map = new LinkedHashMap<Integer,String>();
	map.put(3,"A");
	map.put(1,"B");
	map.put(2,"C");
	map.put(4,"D");
	map.put(4,"E");
	
	Collection<String> collection = map.values();
	Set<Integer> st= map.keySet();
	Iterator<Integer> it = st.iterator();
	while(it.hasNext()){
		System.out.println(it.next()+ " ");
	}
	System.out.println("%%%%%%%%%%%%%%%%%%%%%");
	for(String element : collection){
		System.out.println(element);
	}

	//Map<Integer,String> map2 = new HashMap<Integer,String>();
	
	}
}