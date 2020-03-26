package step._array;
import java.util.*;

public class num1546_array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int iNum = sc.nextInt();
		
		int[] iScore = new int[iNum];
		double[] dNewSocre = new double[iNum];
		int iMaxScore = 0;
		double iSum = 0; 
		double dAvg = 0;
		for(int i = 0; i < iNum; i++) {
			iScore[i] = sc.nextInt();
		}
		
		  for(int i = 0; i < iNum;i++) { 
			  if(iMaxScore < iScore[i]) { 
				  iMaxScore = iScore[i];
			  } 
		  } 
		  
		  for(int i = 0; i < iNum;i++) 
		  { 
			  dNewSocre[i] = (double)iScore[i] / (double)iMaxScore * 100;
			  iSum += dNewSocre[i]; 
		  }
		  dAvg = iSum / iNum;
		  System.out.println(dAvg);
		 sc.close();
		
	}

}
