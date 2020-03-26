package step._practice;
import java.util.*;
public class num10039_practice1 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for(int num = 5 ; num > 0; num--) {
			int score = sc.nextInt();
			if(score < 40) {
				score = 40;
			}
			sum +=score;
		}
		System.out.println(sum / 5);
		sc.close();
	}

}
