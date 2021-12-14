package questionTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

import questionOne.Dish;

public class App {

	public static void main(String[] args) {
//		List<Dish> dishes = new ArrayList<>(List.of(new Dish("Waffle"), 
//				new Dish("Meat of your choice"), 
//				new Dish("potato"), new Dish("really black coffee"),
//				new Dish("egg")));
//		

		List<Dish> dishes = Arrays.asList(new Dish("Waffle"), 
				new Dish("Meat of your choice"), 
				new Dish("Potato"), new Dish("Really black coffee"),
				new Dish("Egg"));
		
		List<String> collect = dishes.stream().map(x -> x.getName()).sorted().collect(Collectors.toList());
		System.out.println(collect);
		
		String collectDishes = dishes.stream().map(x -> x.getName()).sorted().collect(Collectors.joining(", "));
		System.out.println(collectDishes);
		
	}

	
	
}
