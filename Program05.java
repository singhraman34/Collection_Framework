package Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
public class Program05 {
	public static void main (String[]args) {
		//creating a new instance of an ArrayList and assigning it to a variable of type Collection
		Collection c1 = new ArrayList();
		c1.add(34);
		c1.add(33);
		c1.add("mohan");
		c1.add(56.98);
		c1.add('@');
		c1.add(67);
		//creating an iterator object named itr that will allow you to traverse the elements of the collection c1
		Iterator<Integer> itr = c1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("program end");
		
	}

}
