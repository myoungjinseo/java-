package Hw9_1;

public class Television {
	public String model;
	public int price;
	
	//�𵨸��� getter�� setter
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	//������ getter�� setter
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// ������1 - �Ű������� ���� ����Ʈ ������. �𵨸��� "MyTV", ������ 0���� �ʱ�ȭ *****
	public Television() {
		this("MyTV",0);
	}
	
	////������2 - �𵨸��� �Ű������� �޾� �ʱ�ȭ, ���� 0���� �ʱ�ȭ�ϵ�, ���� �ʵ尪�� �������� ���� ������3�� ȣ���Ͽ� �ʱ�ȭ *****
	public Television(String M) {
		this(M,0);
	}
	
	//������3 - �𵨸�� ������ �Ű������� �޾� �ʱ�ȭ *****		setter�� ���� ������ ���� �����ڷ�9�� 9�ʰ� ����� ������� ����
	public Television(String M ,int P) {
		setModel(M);
		setPrice(P);
	}
	
	public String toString() {
        return "�𵨸�:" + model + " ����:" + price;
    } 
	//***************************
	// ���ϸ�: Television .java
	// �ۼ���: ������
	// �ۼ���: 2021-11-03
	// ����: television�� ���� �� �� �Է� �� ��� ������ 
	//***************************
}
