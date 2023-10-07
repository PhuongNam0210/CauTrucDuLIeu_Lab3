package task2;

import java.util.Arrays;
import java.util.Comparator;

public class Order {
	private OrderItem[] items;

	public Order(OrderItem[] items) {
		super();
		this.items = items;
	}

	public double cost() {
		double totalCost = 0.0;
		for (OrderItem item : items) {
			totalCost += item.getP().getPrice();
		}
		return totalCost;
	}

	// using binary search approach
	public boolean contains(Product p) {
		int left = 0;
		int right = items.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (items[mid].getProduct().equals(p)) {
				return true;
			} else if (items[mid].getProduct().compareTo(p) < 0) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return false;
	}

	public int getLength(OrderItem[] items, String type) {
		int count = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i].getType() == type) {
				count++;
			}
		}
		return count;
	}

	// get all products based on the given type using linear search
	public Product[] filter(String type) {
		Product[] correctOnType = new Product[getLength(items, type)];
		int index = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i].getType() == type) {
				correctOnType[index++] = items[i].getProduct();
			}
		}
		return correctOnType;
	}

	public OrderItem[] sort(OrderItem[] items) {
		Arrays.sort(items, Comparator.comparing(item -> item.getProduct().getPrice()));
		return items;
	}

}
