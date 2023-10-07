package task2;

import java.util.Arrays;

public class TestOrder {
	public static void main(String[] args) {
		Product p1 = new Product("001", "Pessi", 9.0, "Soft Drink");
		Product p2 = new Product("002", "Chips", 12.0, "Snack");
		Product p3 = new Product("003", "Red Velvet Cookies", 7.0, "Cookie");
		Product p4 = new Product("004", "Coca Cola", 10.0, "Soft Drink");
		
		OrderItem it1 = new OrderItem(p1, 2);
		OrderItem it2 = new OrderItem(p2, 2);
		OrderItem it3 = new OrderItem(p3, 2);
		OrderItem it4 = new OrderItem(p4, 2);
		
		OrderItem[] items = {it1 ,it2, it3, it4};
		
		Order o1 = new Order(items);
		
		System.out.println("Cost: " + o1.cost());
		System.out.println("Contains: " + o1.contains(p4));
		System.out.println("Contains: " + o1.contains(p3));
		System.out.println("Filter: " + Arrays.toString(o1.filter("Soft Drink")));
		System.out.println(Arrays.toString(o1.sort(items)));
	}
}
