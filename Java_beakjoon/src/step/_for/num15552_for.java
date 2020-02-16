package step._for;

import java.io.*;
import java.util.StringTokenizer;

public class num15552_for {
	public static void main(String[] avgs) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//콘솔로 부터 데이터를 입력받는다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //버퍼에 출력할 결과물을 저장하고 한번에 출력하기 위해서 사용한다.
		int time = Integer.parseInt(bf.readLine());
        String[] nums = new String[2]; 
		for(int i = 0; i < time; i++){
			nums = bf.readLine().split(" ");
			Integer result = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
			//Integer의 toString()를 사용하기 위해서 >> Integer와int의 차이를 구분하자!
            bw.write(result.toString());
            bw.newLine();
		}
        bw.flush();
        bw.close();
        bf.close();
		}

}
