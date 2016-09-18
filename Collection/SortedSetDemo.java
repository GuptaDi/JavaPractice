import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SortedSetDemo{
	public static void main(String[] arg){
		SortedSet<Integer> set = new TreeSet<Integer>();
		set.add(200);
		set.add(300);
		set.add(100);
		set.add(400);
		set.add(100);
		set.add(500);
		
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()){
		System.out.println(iterator.next());
		}
	}
}