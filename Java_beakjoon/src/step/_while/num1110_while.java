package step._while;
import java.util.*;
public class num1110_while {
	public static int cycle(String start) {
		if(Integer.parseInt(start) < 10) {
			start = "0" + start;
			//System.out.println(start);
		}
		int count = 0;
		int left = Integer.parseInt(start) / 10;
		int right = Integer.parseInt(start) % 10;
		while(true) {
			int add = left + right;
			int add2 = add % 10;
			String result = Integer.toString(right) + Integer.toString(add2);
			count++;
			//System.out.println(result);
		
			if(start.equals(result)) {
				break;
			}
			left = Integer.parseInt(result) / 10;
			right = Integer.parseInt(result) % 10;
			
		}
		
		return count;
	}

	public static void main(String[] args) {
		String start = null;
		Scanner sc = new Scanner(System.in);
		start = sc.next();
		int count = cycle(start);
		System.out.println(count);
	}
	

}
