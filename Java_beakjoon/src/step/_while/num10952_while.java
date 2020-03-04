package step._while;
import java.util.*;
public class num10952_while {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		while(true) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if(num1 == 0 && num2 ==0) {
				break;
			}
			System.out.println(num1 + num2);
		}
		sc.close();

	}

}
