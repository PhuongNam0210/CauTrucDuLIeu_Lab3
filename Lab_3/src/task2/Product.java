package task2;

public class Product {
	private String id;
	private String name;
	private double price;
	private String type;
	
	public Product(String id, String name, double price, String type) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public String getId() {
		return id;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return id + " " + name + " " +  price + "  " + type + " " ;
	}
	public int compareTo(Product o) {
		int byName = this.name.compareTo(o.name);
		if(byName==0)
			return Double.compare(price, o.price);
		return byName;
	}
	

}
