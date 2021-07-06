package smallest_number;

import java.util.Random;
import java.util.Scanner;

public class SmallestNumber {

	public static void main(String args[]) {

		smallestNumber();

	}

	public static void smallestNumber() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nth smallest number, N=?");
		int N = scanner.nextInt();

		Random random = new Random();
		int[] numbers = new int[500];
		numbers[0] = random.nextInt(1000);
		int temp;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(1000);
		}

		for (int i = 1; i < numbers.length; i++) {
			for (int x = 0; x < numbers.length - i; x++) {
				if (numbers[x] > numbers[x + 1]) {
					temp = numbers[x];
					numbers[x] = numbers[x + 1];
					numbers[x + 1] = temp;
				}
			}
		}

		for (int i = 0; i <= numbers.length-2; i++) {
			System.out.print(numbers[i] + " - ");
		}
		System.out.println(numbers[numbers.length-1]);

		System.out.println(N+"th smallest number is " + numbers[N - 1]);

	}
}