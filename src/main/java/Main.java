import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		List<String> personas = new ArrayList<>();
		personas.add("Edwin");
		personas.add("Didier");
		personas.add("Méndez");
		personas.add("Rojas");
		personas.add("Carolina");
		personas.add("Ballesteros");
		personas.add("Leidy");
		personas.add("Duran");

		ArrayList<Integer>numeros = new ArrayList<Integer>();
		numeros.add(0);
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);		
		
		System.out.println("************** Lista personas***************");
		personas.stream().forEach( x -> System.out.println(x));

		System.out.println("*********** startsWith() ***********");
		personas.stream().filter(x -> x.toUpperCase().startsWith("M") || x.toUpperCase()
				.startsWith("L") ).forEach(System.out::println);		
		
		System.out.println("*********** count() ***********");
		System.out.println(personas.stream().count()); 

		System.out.println("*********** filter ***********");
		personas.stream().filter(x -> x.startsWith("M") && x.endsWith("z")).forEach(System.out::println); 
			
		System.out.println("*********** limit ***********");
		personas.stream().limit(2).forEach(System.out::println); 

		
		System.out.println("*********** min ***********");
		System.out.println(numeros.stream().min((x,y) -> x - y));
		
		System.out.println("*********** max ***********");
		System.out.println(numeros.stream().max((x,y) -> x - y));
			
		System.out.println("*********** Collections max ***********");
		System.out.println(Collections.max(numeros));
		
		System.out.println("*********** Collections min ***********");
		System.out.println(Collections.min(numeros));

		System.out.println("*********** findFirst ***********");
		System.out.println(numeros.stream().findFirst());
		System.out.println(personas.stream().findFirst());
				
		System.out.println("*********** contains ***********");
		personas.stream().filter(x -> x.toString().contains("e")).forEach(System.out::println);
		
		System.out.println("*********** contains caracteres > 7 ***********");
		personas.stream().filter(x -> x.toString().length() > 7).forEach(System.out::println);
								
		System.out.println("*********** contains caracteres > 7 begin C ***********");
		personas.stream().filter(x -> x.toString().startsWith("C") && x.toString().length() > 7).forEach(System.out::println);

		
	}

}
