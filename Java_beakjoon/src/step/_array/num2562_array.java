package step._array;
import java.util.*;
public class num2562_array {

	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int index = 0;
		for(int i = 0; i < 9;i++) {
			array.add(sc.nextInt());
		}
		int large = (int) array.get(0);
		for(int i = 1; i < 9 ;i++) {
			int next = (int)array.get(i);
			if(next > large) {
				large = next;
				index = i;
			}
		}
		System.out.println(large);
		System.out.println(index);
	}

}
