package Task6;

/*������� ����� �����, ������� ���������� ��������� � ������. ������ �������� �������� �����������������. 
 * ���� � ���� ������� �������� ����� ����������� � ����� � ����������. 
 * ���� ������ ��������� ������ �� �������� ��� ���������������� � ��������������� ��������� �������� �����.*/
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