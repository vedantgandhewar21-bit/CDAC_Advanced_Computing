package TreeSet;

import java.util.TreeSet;

public class Problem_01 {

public static void main(String[] args) {
	
	TreeSet<Integer> set = new TreeSet<>();
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
