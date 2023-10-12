package collections.com.main;
import java.util.*;
public class CollectionsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list1 = new ArrayList<>();
		list1.add(1);
		list1.add("vamsi");
		list1.add(23.56);
		System.out.println(list1);
		list1.set(0, list1);
		list1.remove(1);
		System.out.println(list1);
		
		Set  setVar = new HashSet<>();
		setVar.add(1);
		setVar.add(23);
		setVar.add("hyd");
		 System.out.println(setVar);
		 
		 Set setVar1 = new TreeSet<>();
		 setVar1.add(189);
			setVar1.add(23);
			//setVar1.add("hyd");
			 System.out.println(setVar1);
			 
		Map<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1,"virat");
		map1.put(2,"rohit");
		map1.put(3,"vamsi");
		System.out.println(map1);
		
		Map<Integer,String> map2 = new TreeMap<Integer,String>();
		map2.put(1,"virat");
		map2.put(2,"rohit");
		map2.put(2,"rahul");
		map2.put(3,"vamsi");
		System.out.println(map2);
	}

}
