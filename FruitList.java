package Fruit;

import java.util.ArrayList;

public class FruitList extends Fruit {
	private ArrayList<Fruit> danhSach;

	public FruitList() {
		this.danhSach = new ArrayList<Fruit>();
	}
	
	public FruitList(ArrayList<Fruit> danhSach) {
		this.danhSach = danhSach;
	}
	
	public void themTraiCayIn (FruitIn in) {
		this.danhSach.add(in);
	}
	
	public void themTraiCayOut (FruitOut out) {
		this.danhSach.add(out);
	}

	@Override
	public String toString() {
		return "FruitList [danhSach=" + danhSach + "]";
	}
	
	public void dsLonHon20 () {
		for (Fruit fruit : danhSach) {
			if (fruit.priceForSale() > 20) {
				System.out.println(fruit + "\n");
			}
		}
	}
	
	public int doDai() {
		return danhSach.size();
	}
}
