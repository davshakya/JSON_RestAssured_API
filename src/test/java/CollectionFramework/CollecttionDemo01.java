package CollectionFramework;
import java.util.*;

public class CollecttionDemo01 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Typed safe collection
		ArrayList<String> str1= new ArrayList<String>();
		str1.add("Dev");
		str1.add("Shakya");
		str1.add("Orai");
		
		System.out.println(str1.get(0));
		System.out.println(str1);
		
//		//Untyped safe collection
		LinkedList list1= new LinkedList();
		list1.add("Manan");
		list1.add(123);
		list1.add(1.14);
		list1.add(true);
		list1.addFirst("Manav");
		list1.addLast("Ranjana");
		System.out.println(list1);
//		System.out.println(list1.indexOf("Manan"));
//		int l = list1.indexOf("Manav");
//		System.out.println(l);
//		list1.remove(3);
//		System.out.println(list1);
//		list1.pop();
//		System.out.println(list1);
//		System.out.println(list1.size());
//		System.out.println(list1.isEmpty());
//		System.out.println(list1.contains("Manav"));
		
		list1.set(0,"Chotu");
		System.out.println(list1);
		System.out.println(list1.subList(2, 5));
		
	}
  
}
