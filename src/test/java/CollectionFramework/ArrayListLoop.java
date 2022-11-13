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
	
			
	}	

}
