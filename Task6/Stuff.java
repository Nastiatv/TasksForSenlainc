package Task6;

/*Имеется набор вещей, которые необходимо поместить в рюкзак. Рюкзак обладает заданной грузоподъемностью. 
 * Вещи в свою очередь обладают двумя параметрами — весом и стоимостью. 
 * Цель задачи заполнить рюкзак не превысив его грузоподъемность и максимизировать суммарную ценность груза.*/
public class Stuff{
	
	 
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

	
	
	public Stuff(int w,int v){
		this.weight=w;
		this.value=v;
	
	}
	}