package OCPJP;
import java.util.*;
public class ex_HashMap {
	public static void main(String[]Args) {
		
		HashMap map = new HashMap();
		
		map.put("A","SCJP");
		map.put(100, 1000);
		map.put(new Object(), "SCBCD");
		map.put(null,"B");

		System.out.println(map.toString());
		
		System.out.println("Key A, value is:" + map.get("A"));
		System.out.println("Key 100, value is:" + map.get(new Integer(100)));
		System.out.println("Key Object, value is:"+ map.get(new Object()));
		System.out.println("Key null, value is:" + map.get(null));
		System.out.println("Key B, value is:" + map.get("B"));
	}
}
