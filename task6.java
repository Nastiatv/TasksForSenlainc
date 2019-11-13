import java.util.ArrayList;
import java.util.List;

public class task6 {
	
		/*Имеется набор вещей, которые необходимо поместить в рюкзак. Рюкзак обладает заданной грузоподъемностью. 
		 * Вещи в свою очередь обладают двумя параметрами — весом и стоимостью. 
		 * Цель задачи заполнить рюкзак не превысив его грузоподъемность и максимизировать суммарную ценность груза.*/
	
	public class stuff{
		private int weight;
		private int value;	
		
		
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
	
		public stuff(int w,int v){
			this.weight=w;
			this.value=v;
		}
		}
	
	
	public class Bag {
		private int currentWeight;
	    private int maxWeight;
	    private List<stuff> stuffList;
	    private List<stuff> stuffInBag;

	    public Bag(int maxWeight, List<stuff> stuffList) {
	        this.maxWeight = maxWeight;
	        this.stuffList = stuffList;
	        this.stuffInBag = new ArrayList<stuff>();
	    }

	    public int getMaxWeight() {
	        return maxWeight;
	    }

	    public void setMaxWeight(int maxWeight) {
	        this.maxWeight = maxWeight;
	    }

	    public List<stuff> getStuffsList() {
	        return stuffList;
	    }

	    public void setStuffList(List<stuff> stuffList) {
	        this.stuffList = stuffList;
	    }

	    public List<stuff> getStuffInBag() {
	        return stuffInBag;
	    }

	    public void setStuffInBag(List<stuff> stuffInBag) {
	        this.stuffInBag = stuffInBag;
	    }

	    public void packBag(List<stuff> thingsList) {
	        sortThingsByPrice();
	        for (int i = 0; i < thingsList.size(); i++) {
	            currentWeight += thingsList.get(i).getWeight();
	            if (currentWeight <= maxWeight) {
	                stuffInBag.add(stuffList.get(i));
	            } else {
	                currentWeight -= stuffList.get(i).getWeight();
	                continue;
	            }
	        }
	    }

	    private void sortThingsByPrice() {
	        int temp = 0;
	        for (int i = 0; i < stuffList.size(); i++) {
	            for (int j = 1; j < (stuffList.size() - i); j++) {
	                if (stuffList.get(j - 1).getValue() < stuffList.get(j).getValue()) {
	                    temp = stuffList.get(j - 1).getValue();
	                    stuffList.get(j - 1).setValue(stuffList.get(j).getValue());
	                    stuffList.get(j).setValue(temp);
	                }
	            }
	        }
	    }
	}
	}
	