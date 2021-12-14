package questionTwo;


public class Dish {

	private String name;

	public String getName() {
		return name;
	}

	public Dish(String name) {
		this.name = name;
	}
	
	public static int compareDishes(Dish d1, Dish d2) {
		return d1.getName().compareTo(d2.getName());
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + "]";
	} 
	
	
	
	
	
	
}
