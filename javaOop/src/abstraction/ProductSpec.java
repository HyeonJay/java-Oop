package abstraction;

public class ProductSpec implements Product {

	private String	company;	// ������
	private String	name;		// ��ǰ��
	private String	serialNo;	// �Ϸù�ȣ

	@Override
	public void setInfo( String company, String name, String seialNo ) {
		this.company = company;
		this.name = name;
		this.serialNo = seialNo;
	}

	@Override
	public void getInfo( ) {
		// TODO Auto-generated method stub
		System.out.println("������ : " + this.company);
		System.out.println("��ǰ�� : " + this.name);
		System.out.println("�ø���ѹ� : " + this.serialNo);
	}


}
// ��Ŭ���� ����Ű ����� ���� ���( �⺻ ����Ű�ܿ� �߰���Ű��)
// �޴��� > Window > preference > general > key > copy line �Է� > CTRL + J
// delete line�Է� > CTRL + D