package Collection;
import java.util.ArrayList;
import java.util.Collection;
public class Program02 {
  public static void main (String[]args[]) {
	  Collection c3=new ArrayList();
	  c3.add(34);
	  c3.add("mohan");
	  c3.add('@');
	  c3.add(34.876);
	  System.out.println(c3.contains(34));
	  System.out.println(c3.contains(100));
		System.out.println("size is: "+c3.size());
		System.out.println(c3.hashCode());
  }
}
