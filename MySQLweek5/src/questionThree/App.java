package questionThree;

import java.util.Optional;
import java.util.NoSuchElementException;
public class App {

	public static void main(String[] args) {
		
		Dish d = new Dish("Big5");
			try { 
				b(d);
		} catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
			
		}
		
		

	}
	
	private static void b(Dish d) {
		Optional<Dish> opt = Optional.ofNullable(d);
		System.out.println(a(opt));
		a(Optional.empty());

	}
	
	private static Dish a(Optional<Dish> opt) {
		Dish d = opt.orElseThrow(()->new NoSuchElementException("Nada."));
		return d; 
		
	}

}
