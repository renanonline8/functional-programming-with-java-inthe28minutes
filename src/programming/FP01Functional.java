package programming;

import java.util.List;

public class FP01Functional {
	
	public static void main(String[] args) {
		//printAllNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
		printEvenNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().forEach(System.out::println);
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number % 2 == 0)
			.forEach(System.out::println);
	}
}
