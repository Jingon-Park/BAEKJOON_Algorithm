package step._array;
import java.util.*;

public class num2577_array {

	public static void main(String[] args) {
		int num1, num2, num3, multiple,result;
		int[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		multiple = num1 * num2 * num3;
		String mul = Integer.toString(multiple);
		String[] mul2;
		mul2 = mul.split("");
		for(int i = 0; i < mul2.length; i++) {
			if(mul2[i].equals("0")) {
				count[0]++;
			}else if(mul2[i].equals("1")) {
				count[1]++;
			}else if(mul2[i].equals("2")) {
				count[2]++;
			}else if(mul2[i].equals("3")) {
				count[3]++;
			}else if(mul2[i].equals("4")) {
				count[4]++;
			}else if(mul2[i].equals("5")) {
				count[5]++;
			}else if(mul2[i].equals("6")) {
				count[6]++;
			}else if(mul2[i].equals("7")) {
				count[7]++;
			}else if(mul2[i].equals("8")) {
				count[8]++;
			}else if(mul2[i].equals("9")) {
				count[9]++;
			}
		}
		for(int i =0; i < 10;i++) {
			System.out.println(count[i]);
		}
	}

}
