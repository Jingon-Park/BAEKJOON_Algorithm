package step._array;
import java.util.*;
public class num3052_array {

	public static void main(String[] args) {
		
		int[] iremindSet = new int[42];
		int[] inumSet = new int[10];
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			inumSet[i] = sc.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			int iremind = inumSet[i] % 42;
			iremindSet[iremind]++;
		}
		for(int i = 0; i < 42; i++) {
			if(iremindSet[i] != 0) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
