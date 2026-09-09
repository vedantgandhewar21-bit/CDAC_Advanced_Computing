package HasSet;

import java.util.HashSet;
//import java.util.TreeSet;

public class Practice_01 {
public static void main(String[] args) {
	HashSet<Integer> set = new HashSet<>();
	//TreeSet<Integer> set = new TreeSet<>();
	set.add(77);
	set.add(12);
	set.add(43);
	set.add(27);
	set.add(32);
	set.add(63);
	System.out.println(set.size());
//	System.out.println(set.contains(12)+" "+set.contains(11));
//	set.remove(12);
//	System.out.println(set.contains(12)+" "+set.contains(11));
//	System.out.println(set.size());
	System.out.println(set);
}
}
  