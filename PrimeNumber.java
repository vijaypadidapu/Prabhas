public class PrimeNumber {

	public static void main(String[] args) {
		
		int num =19;
		boolean isPrime =true;
		
		for(int i=2; i<num;i++) {
			
			if(num%i==0) {
				
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num + " is Prime number" );
                        System.out.println("PrimeNumber");
                        System.out.println("PrimeNumber");
		}
		else {
			
			System.out.println("Not a Prime number");
		}
	}
}
