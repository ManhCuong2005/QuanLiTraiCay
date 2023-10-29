package Fruit;

public class FruitIn extends Fruit {
	private double extraIn; //quản lí phí nội bộ 

	public FruitIn() {
		super();
		this.extraIn = 0;
	}
	
	public FruitIn(String name, int age, double price, double extraIn) {
		super(name, age, price);
		this.extraIn = extraIn;
	}

	@Override
	public String toString() {
		return "FruitIn [name=" + super.getName() + ", id=" + super.getId() + ", price=" + super.getPrice() + ", extraIn=" + extraIn + "]";
	}

	public double getExtraIn() {
		return extraIn;
	}

	public void setExtraIn(double extraIn) {
		this.extraIn = extraIn;
	}

	@Override
	public double priceForSale() {
		// TODO Auto-generated method stub
		return extraIn + super.getPrice();
	}
}
