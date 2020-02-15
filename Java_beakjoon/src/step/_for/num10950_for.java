package step._for;
import java.util.*;
public class num10950_for {
	
	static void sum(Scanner cs,int times) {
		int[] left = new int[times];
		int[] right = new int[times];
		
		for(int i = 0; i < times; i++) {
			left[i] = cs.nextInt();
			right[i] = cs.nextInt();
			}
		for(int i = 0; i < times; i++) {
			System.out.println(left[i] + right[i]);
		}
	}
	public static void main(String[] args) {
		int times;
		Scanner cs = new Scanner(System.in);
		times = cs.nextInt();
		sum(cs, times);
		cs.close();
		

	}
	

}
