package abstraction;

public class FruitMain {
	public static void main( String[] args ) {
		// ���� ���̽��� ��ü�� ���� �� ����.
		// ��, FruitInterface f = new FruitInerface( );
		// �̰��� ������ �߻���Ų��

		FruitInterface apple = new AppleImpl();
		// ��ó�� Ÿ�� ���Ǹ� �������̽��� �ϰ�
		// ������ �޼ҵ�� ���� ���̽��� ������ Ŭ������ ������ 
		// ��ü�� �����Ѵ�.�ڡڡڡڡ�
		// AppleImpl apple2 = new AppleImpl( );
		// �� ó�� �ڵ��ϸ� ���Ѵ�.
		apple.display("���ִ� ");

		FruitInterface banana = new BananaImpl();
		banana.display("������ ");

		FruitInterface orange = new OrangeImpl();
		orange.display("��� ");
		//orange Ŭ������ �ִ� getCount( )�� ȣ���ϰ� �ʹ�..
		//orange.getCount( ); // �̰��� ���Ǵ� �Ǿ� ������ ȣ���� ���� �ʴ´�.
	
		// �� ó���Ǵ� ������ �־��� ����( �� ) �� �����϶�� ��
		// ��, ��Ű�� �� �ܿ� �������� ���� ���� ����
		// ���α׷��� ��ġ�� ������
	}
}
