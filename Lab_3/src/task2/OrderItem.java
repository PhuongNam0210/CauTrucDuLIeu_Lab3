package task2;

public class OrderItem {
	private Product p;
	private int quality;

	public OrderItem(Product p, int quality) {
		super();
		this.p = p;
		this.quality = quality;
	}

	public int compareTo(OrderItem o) {
		return p.getId().compareTo(o.p.getId());
	}

	@Override
	public String toString() {
		return p.toString() + " " + quality + " ";
	}

	public double getPrice() {
		return p.getPrice();
	}

	public String getName() {
		return p.getName();
	}

	public String getType() {
		return p.getType();
	}

	public Product getProduct() {
		return p;
	}

	public Product getP() {
		return p;
	}

	public int getQuality() {
		return quality;
	}

}
