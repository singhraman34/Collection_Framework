package Collection;
import java.util.*;
import java.util.ArrayList;
public class Program04 {

	public static void main(String[] args) {
		Collection c1= new ArrayList();
		c1.add(34);
		c1.add("mohan");
		c1.add(34.6);
		c1.add('@');
		//creating an iterator object named itc that will allow you to traverse the elements of the collection c1
		Iterator itr=c1.iterator();
		// hasNext methrd return true if element is present in correct positon 
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		

	}

}
