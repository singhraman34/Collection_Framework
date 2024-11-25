package Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Program07 {
	public static void main(String[]args) {
	Collection c1=new ArrayList();
	// this is array list
	c1.add(23);
	c1.add(34);
	c1.add(44);
	c1.add(56);
	c1.add(67);  c1.add(76);  c1.add(99);
	System.out.println("c1 is " +c1);
	// throw iterator we irerate over the collection one by one

	  Iterator itr=c1.iterator();
	  	while(itr.hasNext()) {
	  		int x=(Integer)itr.next();
	  		if(x%2==1)
	  			itr.remove();
	  	}
	  	System.out.println("c1 is " +c1);	
	}
}
