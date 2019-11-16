package Task6;

/*Имеется набор вещей, которые необходимо поместить в рюкзак. Рюкзак обладает заданной грузоподъемностью. 
 * Вещи в свою очередь обладают двумя параметрами — весом и стоимостью. 
 * Цель задачи заполнить рюкзак не превысив его грузоподъемность и максимизировать суммарную ценность груза.*/
public class Stuff {

	private int weight;
	private int value;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public Stuff(String name, int w, int v) {
		this.weight = w;
		this.value = v;
		this.name=name;

	}
}