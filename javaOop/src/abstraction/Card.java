package abstraction;

public class Card {

	static final int			WIDTH	= 150;	// ī���� ����
	static final int			HEIGHT	= 300;	// ī���� ����
	//���� Ʈ������ 4���� ���̰� �ִµ� �� ���ӿ����� ��Ʈ���̸� ������ �÷��� �Ѵ�.
	public static final String	KIND	= "��Ʈ";
	private int					num;

	public Card( ) {
		this.num = (int) ((Math.random()*13)+1);
		// MathŬ������ ���а� ���õ� Ŭ���� 
		// Math.random( ) �޼ҵ�� ����������  ���� ���ڸ�
		//�߻���Ű�� ���� 
		//* 13 �� ����Ʈ ��, +1�� start ��
	}
	public int getNum( ) {
		return num;
	}

}