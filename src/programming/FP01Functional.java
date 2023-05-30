package programming;

import java.util.List;

public class FP01Functional {
	
	public static void main(String[] args) {
		//printAllNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
		//printEvenNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
		//printOddNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
		//printAllCoursesIndividually(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes"));
		//printCoursesContainingSpringWord(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes"));
		//printCoursesContainingAtLeastFourLetters(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes"));
		//printSquaresOfEvenNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
		//printCubesOfOddNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
		printNumbersOfCaractersEachCourseName(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes"));
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().forEach(System.out::println);
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number % 2 == 0)
			.forEach(System.out::println);
	}
	
	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number % 2 == 1)
			.forEach(System.out::println);
	}
	
	private static void printAllCoursesIndividually(List<String> courses) {
		courses.stream()
			.forEach(System.out::println);
	}
	
	private static void printCoursesContainingSpringWord(List<String> courses) {
		courses.stream()
			.filter(course -> course.contains("Spring"))
			.forEach(System.out::println);
	}
	
	private static void printCoursesContainingAtLeastFourLetters(List<String> courses) {
		courses.stream()
			.filter(course -> course.length() >= 4)
			.forEach(System.out::println);
	}
	
	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number % 2 == 0)
			.map(number -> number * number)
			.forEach(System.out::println);
	}
	
	private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number % 2 != 0)
			.map(number -> number * number * number)
			.forEach(System.out::println);
	}
	
	private static void printNumbersOfCaractersEachCourseName(List<String> courses) {
		courses.stream()
			.map(course -> course.length())
			.forEach(System.out::println);
	}
}
