package Task6;

import java.util.ArrayList;

public class Check {

	public static void main(String[] args) {

		Bag firstBag = new Bag(10);

		Stuff phone = new Stuff(1, 100);
		ArrayList<Stuff> stuffList = new ArrayList<Stuff>();
		stuffList.add(phone);
		Stuff laptop = new Stuff(4, 200);
		stuffList.add(laptop);
		Stuff key = new Stuff(3, 200);
		stuffList.add(key);
		Stuff books = new Stuff(3, 50);
		stuffList.add(books);
		Stuff food = new Stuff(2, 20);
		stuffList.add(food);
		firstBag.setStuffList(stuffList);

		firstBag.packBag(firstBag.getStuffList());

	}
}
