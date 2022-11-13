package CollectionFramework;
import java.util.*;
public class CollectionMap {

	public static void main(String[] args) {
		HashMap<String, Integer> courses =new HashMap<>();

		//#########adding element#############
		courses.put("Core Java", 4000);
		courses.put("Python", 5000);
		courses.put("Adroid", 3000);
		System.out.println(courses);  
		System.out.println(courses.size());
		System.out.println(courses.get("Python"));
		courses.forEach((k1,v1)->{
			System.out.println(k1+" = "+v1);
		});
		
	}

}
