public class Armstrong {

	public static void main(String[] args) {

		int n = 153;

		int temp = n;

		int r;
		int sum = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r * r * r;
		}
		if (temp == sum)
			System.out.println("The given number is Armstrong Number");
		else
			System.out.println("The given number is not a Armstrong number");
	}

}