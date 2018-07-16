package OCPJP;
import java.util.*;
public class Priority_Queue {

	public static void main(String[]Args) {
		Queue q = new LinkedList();
	
		q.offer("111");
		q.offer("222");
		q.offer("333");
		
		
		System.out.println(q.toString());
		
		Object o ;
		String s;
		while( (o=q.poll())!=null ) {
			s = (String)o;
			System.out.println(s);
		}
		
		System.out.println(q.toString());
		
	}
	
	
}
