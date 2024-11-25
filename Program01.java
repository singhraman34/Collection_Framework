package Collection;
import java.util.*;
public class Program01 {
public static void main(String[]args) {
	// this is create of collection.
	
	/* we can create object of any class on collection referance  so that a collection is create where we start
	grouping  of object */
	
	// in this collection always create object
	
			Collection c1 =new ArrayList();
			Collection c2 =new ArrayList();
			c1.add(23);
			System.out.println(c1);
			// when element are added then return true (always return boolean)
			System.out.println(c1.add(34));
			c1.add(23.45);
			c1.add("mohan");
			c1.add('@');
			//System.out.println(c1);
			c2.add(2345);
			c2.add(765);
			c2.add(765);
			System.out.println("c1 is "+c1);
			System.out.println("c2 is "+c2);
			c1.addAll(c2);
			System.out.println(" now c1 is "+c1);
			c1.remove(23);
			c1.remove(765);
			System.out.println(" now c1 is "+c1);
			
}
}
