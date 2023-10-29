package Fruit;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner key = new Scanner (System.in);
		FruitList traiCay = new FruitList();
		
		int sum = 0;
		int soLuong;
		int luaChon = 0;
		do {
			System.out.println("vui long chon chuc nang: \n");
			System.out.println("1. Them danh sach FruitIn.\n"
					         + "2. Them danh sach FruitOut.\n"
					         + "3. In ra danh sách Fruit.\n"
					         + "4. In danh sách FruitIn và FruitOut có priceForSale lớn hơn 20.\n"
					         + "5. Tính tổng số Fruit có trong danh sách. \n"
					         + "0. Thoat khoi chuong trinh.");
			
			luaChon = key.nextInt();
			
			if (luaChon == 1) {
				System.out.println("bạn nhập bao nhiêu trái cây: ");
				soLuong = key.nextInt();
				for (int i = 1; i <= soLuong; i++) {
					System.out.println("nhap ma trai cay: \n");
					int id = key.nextInt();
					System.out.println("nhap gia tien: \n");
					double price = key.nextDouble();
					System.out.println("nhap ten trai cay: \n");
					key.nextLine();
					String name = key.nextLine();
					System.out.println("nhap phi noi bo: \n");
					Double extraIn = key.nextDouble();
					FruitIn fruit = new FruitIn(name, id, price, extraIn);
					
					traiCay.themTraiCayIn(fruit);
				}
			} else if (luaChon == 2) {
				System.out.println("bạn nhập bao nhiêu trái cây: ");
				soLuong = key.nextInt();
				for (int i = 1; i <= soLuong; i++) {
					System.out.println("nhap ma trai cay: \n");
					int id = key.nextInt();
					System.out.println("nhap gia tien: \n");
					double price = key.nextDouble();
					System.out.println("nhap ten trai cay: \n");
					key.nextLine();
					String name = key.nextLine();
					System.out.println("nhap xuat xu trai cay: \n");
					String orgin = key.nextLine();
					System.out.println("nhap phi nhap khau: \n");
					double extraOut = key.nextDouble();
					FruitOut fruit = new FruitOut(name, id, price, orgin, extraOut);
					
					traiCay.themTraiCayOut(fruit);
				}
			} else if (luaChon == 3) {
				System.out.println("danh sách trái cây:\n");
				System.out.println(traiCay);
			} else if (luaChon == 4) {
				System.out.println("ds trái cây có giá tiền lớn hơn 20.\n");
				traiCay.dsLonHon20();
			} else if (luaChon == 5 ) {
				System.out.println("tổng số fruit có trong ds.\n" + traiCay.doDai());
			}
		} while (luaChon != 0);
		
		System.out.println("Thank you for you");
	}
}