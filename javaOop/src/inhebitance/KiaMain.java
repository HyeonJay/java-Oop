package inhebitance;

public class KiaMain {
	public static void main( String[] args ) {
	
		KiaCar K5 = new KiaCar();

		K5.setCompanyName("���");
		K5.setCarName("K5");

		System.out.println(K5.getCompanyName() + "\t" + K5.getCarName() + "\t" + Car.CAR);
		//���� ����� ���â�� �ߴ� ������
		//���������� ũ�� ������ �ƴ����� ( ���α׷��� �ߴܵ� ������ �ƴ����� )
		// �׷��ٰ� �չ����� �ڵ� ��ĵ� �ƴϴ�. ����� ������� �ڵ��ߴٶ�� �ǹ�
		//�ڹ� �����ڶ�� �̷� ���� ���� �����ؾ� �Ѵ�.
		//�� ��Ȳ�̶�� CAR�� Ŭ���� �������� �ν��Ͻ� ������ �ƴϱ� ������
		// �ν��Ͻ��� ȣ������ ����( k5... )Ŭ������ ȣ���ض�! ( Car.CAR )��� ���̴�.
	}
}
