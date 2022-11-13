package CollectionFramework;
import RestAssuredDemo.BaseClassDemo;

public class ChilledClassDemo {

	public static void main(String[] args) {
		BaseClassDemo.addNumP(4, 5);
		BaseClassDemo r=new BaseClassDemo();
		System.out.println(r.addNumR(5, 5));
	}

}
