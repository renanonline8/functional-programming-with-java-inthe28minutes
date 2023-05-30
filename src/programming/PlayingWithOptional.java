package programming;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 * 
 * @author renan
 * Usamos o Optional quando o redultado de um pedicado pode retornar nulo
 * Assim evitamos o lançamento de uma exceção de NullPointer tão comum no Java
 * Este recurso foi implementado a partir do Java 8
 */
public class PlayingWithOptional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean condition = true;
		while (condition) {
			List<String> fruits = List.of("apple", "banana", "mango");
			
			System.out.println("Digite a letra que deseja procurar uma fruta que comece com ela:");
			String letter = sc.nextLine();
			System.out.println("A ketra escolhida foi: " + letter);
			
			Predicate<? super String> predicate = fruit -> fruit.startsWith(letter.toLowerCase());
			Optional<String> optional = fruits.stream().filter(predicate ).findFirst();
			
			System.out.println("Localizar primeira fruta com a letra " + letter + ".");
			System.out.println("Optional está vazio? " + optional.isEmpty());
			System.out.println("Optional possui valor? " + optional.isPresent());
			
			if (optional.isPresent()) {			
				System.out.println("A fruta é " + optional.get());
			} else {
				System.out.println("Não possui fruta com essa letra");
			}
		}
		
		sc.close();
	}
}
