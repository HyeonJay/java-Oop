package abstraction;

public class Notebook extends ProductSpec {
	private String	cpu;
	private String	ram;
	private String	hdd;

	public void setInfo( String company, String name, String seialNo, String cpu, String ram, String hdd ) {
		super.setInfo(company, name, seialNo);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;

	}
//����
	//�Ķ���ͷ� �Ѿ�� ���鵵 �ٷ� super�� ���� �θ�޼ҵ��� �Ķ���ͷ� ������ �ٷ� set�Ѵ�,
	// ��, ����� ������ �θ��ڽ� ���迡�� �����ϹǷ�, �θ��� ����� ���� ���ٿ��� ����������.
	@Override
	public void getInfo( ) {
		super.getInfo();
		System.out.println("cpu ���� : " + this.cpu);
		System.out.println("���θ޸� ���� : " + this.ram);
		System.out.println("�ϵ��ũ ���� : " + this.hdd);
	}
/*
 * @Story :
 * Ŀ�� ��ü Ŭ������ ���� ������ �Ʒ� ��ó�� �ϳ��� Ŭ������ ������ ��� �ݺ��ؼ� ���� �ٸ� ��ü�� ������ ��
 * ������ ��ɿ� ���� �ݺ� ����ϴ� ���� [������]�����ε��̶�� �Ѵ�.
 * �Ʒ� �������� �����ڸ� ������ �ݺ������Ƿ� ������ �����ε��̰� ���� �޼ҵ带 �Ķ���͸� �ٸ� ���·� �������� ���� �̸����� ���� �Ͽ��ٸ�
 * �̸� [�޼ҵ�]�����ε��̶�� �Ѵ�.*/
}
