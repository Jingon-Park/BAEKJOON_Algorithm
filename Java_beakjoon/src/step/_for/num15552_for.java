package step._for;

import java.io.*;
import java.util.StringTokenizer;

public class num15552_for {
	public static void main(String[] avgs) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//�ַܼ� ���� �����͸� �Է¹޴´�.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //���ۿ� ����� ������� �����ϰ� �ѹ��� ����ϱ� ���ؼ� ����Ѵ�.
		int time = Integer.parseInt(bf.readLine());
        String[] nums = new String[2]; 
		for(int i = 0; i < time; i++){
			nums = bf.readLine().split(" ");
			Integer result = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
			//Integer�� toString()�� ����ϱ� ���ؼ� >> Integer��int�� ���̸� ��������!
            bw.write(result.toString());
            bw.newLine();
		}
        bw.flush();
        bw.close();
        bf.close();
		}

}
