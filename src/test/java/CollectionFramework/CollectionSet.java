package CollectionFramework;
import java.util.*;
public class CollectionSet {

	public static void main(String[] args) {
		
		//#################Untyped safe collection###########

		HashSet<Double> set1=new HashSet<Double>();
		set1.add(12.4);
		set1.add(14.5);
		set1.add(11.5);
		System.err.println(set1);
		

		//#################Used for sorting###########
		TreeSet<Double> tSet1=new TreeSet<Double>();
		tSet1.addAll(set1);
		System.out.println(tSet1);
		
		
		 	
		
	}

}
