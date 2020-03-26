package step._practice;
import java.util.*;
public class num_5543_practice1 {

	public static void main(String[] args) {
		
		int[] iMenu = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			iMenu[i] = sc.nextInt();
		}
		int ismallPrice = iMenu[0];
		int ismallPrice2 = iMenu[3];
		for(int i = 1; i < 3;i++) {
			if(ismallPrice > iMenu[i]) {
				ismallPrice = iMenu[i];
			}
		}
		if(ismallPrice2 > iMenu[4]) {
			ismallPrice2 = iMenu[4];
		}
		System.out.println(ismallPrice + ismallPrice2 - 50);
		sc.close();
	}

}
