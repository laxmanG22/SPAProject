package spaAssignments;

public class Reverse20Primes {
	public static void main(String[] args) {
		int count=0;
		int number=2;
		int [] primes=new int[20];
		
		while(count<20) {
			if(isPrime(number)) {
				primes[count]=number;
				count++;
			}
			number++;
		}
		System.out.println("The Reverse 20 Prime Numbers are:");
		for(int i=19;i>=0;i--) {
			System.out.print(primes[i]+" ");
		}
		
	}
	
	public static boolean isPrime(int n) {
		if (n<2) return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
}
