package Fruit;

public class Fruit implements IFruit {
	private int id;
	private double price;
	private String name;
	
	public Fruit() {
		this.name = "";
		this.id = 0;
		this.price = 0;
		}
	
	public Fruit(String name, int id, double price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit [id=" + id + ", price=" + price + ", name=" + name + "]";
	}

	@Override
	public double priceForSale() {
		// TODO Auto-generated method stub
		return 0;
	}

}
