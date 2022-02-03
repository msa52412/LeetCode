package new1;

public class Kmp {
	private static int[][]dp;
	private static String pat="bab";
	
	public static void getnum(String pat) {
		int m=pat.length();
		dp=new int[m][256];
		dp[0][pat.charAt(0)]=1;
		int x=0;
		for(int j=1;j<m;j++) {
			for(int c=0;c<256;c++) {
				if(pat.charAt(j)==c) {
					dp[j][c]=j+1;
				}
				else {
					dp[j][c]=dp[x][c];
				}
				
			}
			x=dp[x][pat.charAt(j)];
		}
	}
	public static int search(String txt) {
		int m=pat.length();
		int n=txt.length();
		int j=0;
		for(int i=0;i<n;i++) {
			j=dp[j][txt.charAt(i)];
			if(j==m) {
				return i-m+1;
			}
		}
		return -1;
	}
	public static void main(String[] aw) {
		
		
		getnum(pat);
		String txt="ikjkbabjik";
		System.out.print(search(txt));
		
		
	}
	public int strStr(String haystack, String needle) {
		int n=haystack.length(),m=needle.length();
		if(m==0) return 0;
		int[][] dp=getArray(needle);

		int j=0;
		for(int i=0;i<n;i++){
			j=dp[j][haystack.charAt(i)-'a'];
			if(j==m) return i-m+1;
		}
		return -1;

	}
	public int[][] getArray(String p){
		int m=p.length();
		int[][] dp=new int[m][26];
		dp[0][p.charAt(0)-'a']=1;
		int x=0;
		for(int j=1;j<m;j++){
			for(int i=0;i<26;i++){
				if(p.charAt(j)-'a'==i){
					dp[j][i]=j+1;
				}
				else dp[j][i]=dp[x][i];
			}
			x=dp[x][p.charAt(j)-'a'];
		}
		return dp;
	}

}
