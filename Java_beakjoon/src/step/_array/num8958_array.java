package step._array;
import java.util.*;
public class num8958_array {

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int line = Integer.parseInt(sc.nextLine());
		int i = 0;
		while(i < line) {
			count = 0;
			i++;
			String str1 = sc.nextLine();
			for(int j = 0; j < str1.length(); j++) {
				if(str1.charAt(j) == 'O') {
					count++;
					sum += count;
				}else 
					count = 0;

			}
			System.out.println(sum);
			sum = 0;
			
		}


	
	}

}
