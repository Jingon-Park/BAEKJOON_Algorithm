package step._if;
import java.util.*;
public class num2753_if {

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		
		if((year % 4 == 0) && (year % 100 != 0)) {
			System.out.println(1);
		}
		else if (year % 400 == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

	}

}
