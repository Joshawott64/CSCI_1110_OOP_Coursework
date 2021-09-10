/*
 * Author: Joshua Gray
 * Date: 9/9/21
 * 
 * This program uses a generic method to remove duplicate 
 * integers from an arraylist.
 */
import java.util.ArrayList;

public class Exercise19_03 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(14);
		list.add(24);
		list.add(14);
		list.add(42);
		list.add(25);
		
		ArrayList<Integer> newList = removeDuplicates(list);
		
		System.out.print(newList);

	}
	// Returns list without duplicate integers
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < i; j++) {
				if (list.get(j) == list.get(i)) {
					list.remove(i);
				}
			}
		}
		return list;
	}

}
