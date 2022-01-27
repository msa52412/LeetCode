package new1;

import java.util.Arrays;

public class sushu {

	public static void main(String[] adw) {
		
		System.out.print(countPrime(100));
		
	}
	public static boolean isPrime(int n) {
		for(int i=2; i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
			
			
		}
		return true;
		
		
	}
	public static int countPrime(int n) {
		boolean[] isPrime=new boolean[n];
		Arrays.fill(isPrime, true);
		for(int i=2;i*i<=n;i++) {
			if(isPrime[i]) {
				for(int j=i*i;j<n;j+=i) {
					isPrime[j]=false;
				}
			}
			
		}
		int count=0;
		for(int i=2;i<n;i++) {
			if(isPrime[i]) {
				count++;
			}
		}
		return count+1;
		
		
	}
	
}
