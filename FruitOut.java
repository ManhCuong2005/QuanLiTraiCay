package Fruit;

public class FruitOut extends Fruit {
	private String orgin; //xuất xứ
	private double extraOut; //phí nhập khẩu
	
	public FruitOut() {
		super();
		this.orgin = "";
		this.extraOut = 0;
	}
	
	@Override
	public String toString() {
		return "FruitOut [name=" + super.getName() + ", id=" + super.getId() + ", price=" + super.getPrice() + ", orgin=" + orgin + ", extraOut=" + extraOut + "]";
	}

	public FruitOut(String name, int age, double price, String orgin, double extraOut) {
		super(name, age, price);
		this.orgin = orgin;
		this.extraOut = extraOut;
	}

	public String getOrgin() {
		return orgin;
	}

	public void setOrgin(String orgin) {
		this.orgin = orgin;
	}

	public double getExtraOut() {
		return extraOut;
	}

	public void setExtraOut(double extraOut) {
		this.extraOut = extraOut;
	}

	@Override
	public double priceForSale() {
		// TODO Auto-generated method stub
		return super.getPrice() + this.extraOut + (0.1 * this.extraOut);
	}
}
