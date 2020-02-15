package step._for;
import java.util.*;
public class num8393_for {

	public static void main(String[] args) {
		int times;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		times = sc.nextInt();
		sc.close();
		for(int i = 0; i <= times; i++) {
			num = num + i;
		}
		System.out.println(num);
	}

}
