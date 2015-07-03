package syntax;

public class Overriding {
	public static void main( String[] args ) {
		Parents p = new Parents();
		p.show();

		Child c = new Child();
		c.show();
	}
}

class Parents {
	void show( ) {
		System.out.println("Parents �� show( )�� ���� ..");
	}
}

class Child extends Parents {
	void show( ) {
		//System.out.println("Child �� show( )�� ���� .."); //��ü ���⿡�� �������� �ǹ�
		super.show(); // �̰��� �θ��� �޼ҵ带 �״�� ����ϰڴٴ� �ǹ�
	}

}
// ��ü ���� ��� 4�� Ư¡
// 1. ����ȭ : getter / setter , ������, this
// 2. �پ缺 : ������(�޼ҵ�) �����ε�, �θ� �޼ҵ� �������̵�
// 3. ��� : extends, super
// 4. �߻� : interface, abstract class