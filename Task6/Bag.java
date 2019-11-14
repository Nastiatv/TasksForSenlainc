package Task6;

import java.util.ArrayList;
import java.util.List;

public class Bag {
	private int maxWeight;
	private int currentWeight;
    private List<Stuff> stuffInBag;
	private List<Stuff> stuffList;
	
	public Bag(int maxWeight) {
		this.maxWeight=maxWeight;
		this.stuffInBag = new ArrayList<Stuff>();
	}
	
	public int getMaxWeight() {
		return maxWeight;
	}


	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}


	public int getCurrentWeight() {
		return currentWeight;
	}


	public void setCurrentWeight(int currentWeight) {
		this.currentWeight = currentWeight;
	}


	public List<Stuff> getStuffInBag() {
		return stuffInBag;
	}


	public void setStuffInBag(List<Stuff> stuffInBag) {
		this.stuffInBag = stuffInBag;
	}


	public List<Stuff> getStuffList() {
		return stuffList;
	}


	public void setStuffList(List<Stuff> stuffList) {
		this.stuffList = stuffList;
	}
		
	
    
    private void sortStuffByValue() {
        int n = 0;
        for (int i = 0; i < stuffList.size(); i++) {
            for (int j = 1; j < (stuffList.size() - i); j++) {
                if (stuffList.get(j - 1).getValue() < stuffList.get(j).getValue()) {
                    n = stuffList.get(j - 1).getValue();
                    stuffList.get(j - 1).setValue(stuffList.get(j).getValue());
                    stuffList.get(j).setValue(n);
                }}}}
    
    
    public void packBag(List<Stuff> stuffList) {
        sortStuffByValue();
        for (int i = 0; i < stuffList.size(); i++) {
            currentWeight += stuffList.get(i).getWeight();
            if (currentWeight <= maxWeight) {
                stuffInBag.add(stuffList.get(i));
            } else {
                currentWeight -= stuffList.get(i).getWeight();
                continue;
            }}}}