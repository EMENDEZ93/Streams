import java.util.ArrayList;
import java.util.List;

public class StreamsApp {

	private List<String> lista;
	private List<String> numeros;

	public StreamsApp() {
		lista = new ArrayList<>();
		lista.add("MENDEZ");
		lista.add("dezmen");
		lista.add("edwin");
		lista.add("rojas");

		numeros = new ArrayList<>();
		numeros.add("4");
		numeros.add("3");
		numeros.add("2");
		numeros.add("1");
	}

	public void filtrar() {
		//lista.stream().filter(x-> x.startsWith("M")).forEach(System.out::println);
		lista.stream().filter(x-> x.startsWith("M")).forEach(x -> System.out.println(x));
	}

	public void ordenar() {
		//lista.stream().sorted().forEach(System.out::println);
		lista.stream().sorted((x,y)-> y.compareTo(x)).forEach(System.out::println);
	}

	public void transformar() {
		//lista.stream().map(String::toUpperCase).forEach(System.out::println);
		//lista.stream().map(String::toLowerCase).forEach(System.out::println);
		numeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::print);
	}

	public void limitar() {
		lista.stream().limit(2).forEach(System.out::println);
	}

	public void contar() {
		lista.stream().count();
	}

	public static void main(String[] args) {
		StreamsApp app = new StreamsApp();
		//app.filtrar();
		//app.ordenar();
		//app.transformar();
		//app.limitar();
		app.contar();
	}
}