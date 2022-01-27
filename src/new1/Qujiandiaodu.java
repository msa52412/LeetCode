package new1;

import java.util.Arrays;
import java.util.Comparator;

public class Qujiandiaodu {

	public static void main(String[] aw) {
		
	    int[][] inter={
			{1,2},{2,3},{3,4},{1,3}
		};
			
		
		
	
	System.out.print(getnum(inter));	
	
	}
	

	public static int getnum(int[][] inter) {
		Arrays.sort(inter, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO 自动生成的方法存根
				return o1[1]-o2[1];
			}
			
			
		});
		int count=1;
		int end =inter[0][1];
		for(int[] inter1:inter) {
			int start =inter1[0];
			if(start>=end) {
				count++;
				end=inter1[1];
			}
		}
		return count;
	}

}
