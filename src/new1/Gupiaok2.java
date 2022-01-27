package new1;

public class Gupiaok2 {
	public static int getnum(int[] price,int k) {
	
		
	    int dp_i10=0,dp_i11=Integer.MIN_VALUE;
	    int dp_i20=0,dp_i21=Integer.MIN_VALUE;
	    for(int pre:price) {

	    	dp_i20=Math.max(dp_i20, dp_i21+pre);
	   
	    	dp_i21=Math.max(dp_i21, dp_i10-pre);
	    	
	    	dp_i10=Math.max(dp_i10, dp_i11+pre);
	    
	    	dp_i11=Math.max(dp_i11, -pre);
	   
	    	
	}
	    return dp_i20;

}
	public static void main(String[] a) {
	
	int k=2;
	int[] price= {1,3,5,10,50,3,1,20,1,50,60,20,50,1,90};
	System.out.print(getnum(price, k));
	
	
	}}
