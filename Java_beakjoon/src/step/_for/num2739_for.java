package step._for;
import java.util.*;
public class num2739_for {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(int i = 1; i < 10;i++) {
			System.out.println(num + " * "+ i + " = "+ (num * i));
		}
		sc.close();

	}

}
