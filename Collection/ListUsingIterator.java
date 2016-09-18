import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListUsingIterator{
	public static void main(String arg[]){
		List<String>list = new ArrayList<String>();
		list.add("ABC");
		list.add("PQR");
		list.add("XYZ");
		list.add("ABC");

		for(String element : list){
			System.out.println(element);
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%");

		// using Iterator
		ListIterator<String> it = list.listIterator();
		while(it.hasNext()){
			System.out.println(it.next()+ " ");
		}
	
	}
}