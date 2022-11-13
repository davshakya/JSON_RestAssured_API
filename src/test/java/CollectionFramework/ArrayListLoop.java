package CollectionFramework;

import java.util.*;
public class ArrayListLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Apple");
		list1.add("Mango");
		list1.add("Banana");
		list1.add("Orange");
		System.out.println(list1);
		
		//################for-each loop################
		for(String str:list1){
			System.out.println(str+" "+str.length());
		}	
		
		//################Traverse using Iterator:: Forword traversing ################
		
		Iterator<String> itr = list1.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		//################Traverse using Iterator:: Backword traversing ################
		ListIterator<String> stIterator= list1.listIterator(list1.size());
		while(stIterator.hasPrevious())
		{
			String preValue = stIterator.previous();
		 	System.out.println(preValue);
		}
		
		//################Traverse using lambda ################
		TreeSet<String> set1=new TreeSet<String>();
		set1.addAll(list1);
		set1.forEach(e->{
			System.out.println(e);
		});
		
		
		
	}	
}
