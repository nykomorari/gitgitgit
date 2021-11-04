package ProjectTask;

public class Project {

	public static void main(String[] args) {

		int num = 26;
		boolean isPrime = true;

		for (int i = 2; i <= num; i++)

		{
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {

			System.out.println(num + " is Prime number ");
		} else {
			System.out.println("number is not Prime");
		}
	}
}