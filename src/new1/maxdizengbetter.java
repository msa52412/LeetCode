package new1;

public class maxdizengbetter {
	public static void main(String[] asw) {
		int[] a={10,9,2,5,3,7,101,18};
		System.out.print(maxdizeng(a));
	}
	
	
	public static int maxdizeng(int[] a) {
		int[] top=new int[a.length];
		int num=0;
		for(int i=0;i<a.length;i++) {
			int poker=a[i];
			int left=0,right=num;
			while(left<right) {
				int mid=(left+right)/2;
				if(top[mid]>poker) {
					right=mid;
				}
				else if(top[mid]<poker) {
					left=mid+1;
				}
				else
				{right=mid;
					
				}
				
			}
			if(left==num) {
				num++;
			}
			top[left]=poker;
			
		}
		return num;
		
	}

}
