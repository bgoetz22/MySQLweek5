package questionOne;

import java.util.*;
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;



public class App {

	public static void main(String[] args) {
		
		List<Dish> dishes = new ArrayList<>(List.of(new Dish("Waffle"), 
				new Dish("Meat of your choice"), 
				new Dish("potato"), new Dish("really black coffee"),
				new Dish("egg")));
		//command + shift + F to tab over: 

		Comparator<Dish> comp;

		String type = "METHOD_REFERENCE";
		
//		switch (type) {
//		
//		case "LAMBDA":
//			comp = (d1, d2) -> { return Dish.compareDishes(d1, d2);};
//			System.out.println("Sorting by Lambda");
//			break;
//		case "METHOD_REFERENCE":
//			comp = Dish::compareDishes;
//			break;
//		default:
//
//			throw new RuntimeException("Unhandled sort type: " + type);
//		}
		comp = (d1, d2) -> { return Dish.compareDishes(d1, d2);};
		System.out.println(comp);
		dishes.sort(comp);
//		System.out.println(dishes);
//		dishes.forEach(dish -> System.out.println(dish));
		print(dishes);
	}
	
		private static void print(List<Dish>dishes) {
			dishes.forEach(dish -> System.out.println(dish));
			
		}

	

}


