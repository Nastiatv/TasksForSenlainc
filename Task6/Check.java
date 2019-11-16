package Task6;

import java.util.ArrayList;
import java.util.List;

public class Check {

	public static void main(String[] args) {

		Bag firstBag = new Bag(10);

		
		
		List<Stuff> stuffList = new ArrayList<Stuff>();
		
		
		stuffList.add(new Stuff("phone", 1, 100));
		stuffList.add(new Stuff("laptop", 4, 200));
		stuffList.add(new Stuff("key", 3, 200));
		stuffList.add(new Stuff("books", 3, 50));
		stuffList.add(new Stuff("food", 2, 20));
	
		firstBag.setStuffList(stuffList);

		firstBag.packBag(firstBag.getStuffList());

	}
}
