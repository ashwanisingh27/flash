package CollectionCodes;

import java.util.*;

public class Tree_Set {
	public static void main(String args[]) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(24);
		set.add(66);
		set.add(12);
		set.add(15);
		System.out.println("Highest Value: " + set.pollFirst());
		System.out.println("Lowest Value: " + set.pollLast());
	}
}
