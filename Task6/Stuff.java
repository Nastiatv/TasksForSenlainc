package Task6;

/*������� ����� �����, ������� ���������� ��������� � ������. ������ �������� �������� �����������������. 
 * ���� � ���� ������� �������� ����� ����������� � ����� � ����������. 
 * ���� ������ ��������� ������ �� �������� ��� ���������������� � ��������������� ��������� �������� �����.*/
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