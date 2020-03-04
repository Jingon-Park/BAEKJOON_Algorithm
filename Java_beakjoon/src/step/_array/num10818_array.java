package step._array;
import java.util.*;
public class num10818_array {
	public static int small(ArrayList array) {
		int small = (int)array.get(0);
		int size = array.size();
		for(int i = 1; i < size; i ++) {
			int next = (int)array.get(i);
			if(next < small)
				small = next;
		}
		return small;
	}
	public static int large(ArrayList array) {
		int large = (int)array.get(0);
		int size = array.size();
		for(int i = 1; i < size; i ++) {
			int next = (int)array.get(i);
			if(next > large)
				large = next;
		}
		return large;
	}
	
	public static void main(String[] args) {
		int size, small, large;
		ArrayList array1 = new ArrayList();
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			array1.add(sc.nextInt());
		}
		small = small(array1);
		large = large(array1);
		System.out.println(small + " " + large);
		
	}

}
