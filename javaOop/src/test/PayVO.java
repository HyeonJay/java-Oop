package test;

public class PayVO
{
	//�ʵ忡 ����� �ν��Ͻ� ������ �ݵ�� ���������ڵ� �� private���� �����Ͽ�
	//����ȭ�� ������ �Ѵ�.
	//�׷��� ������ getter, setter�� �� ������ ����.
	private String				name;		//�����̸�
	private int					salary;	// �޿�

	// ������ ���ѹα� �����̶�� ������ �˾ƾ� �� ����
	//����, �����Ǿ���ϴ� �ʵ尪�̴�.
	//�̷� ���� ������ �Ǿ�� �ϹǷ� ����� ó���ϸ�
	//static�̶�� Ŭ���� ���� Ű���带 �ٿ��� �������ش�.
	//�׸��� �������� ������ ���α׷��ֿ����� �̷� ������ 
	//���� �빮�ڷ� ǥ���ؼ� �����Ѵ�.

	//final �� �ٲ��� ���Ѵ�.�� �ǹ�
	//setter, getter�� ����� �ȵ�. 
	//�ֳ��ϸ� �������̱� �����̴�.

	public static final double	Tax	= 0.1;	// ���� 10%�� ������
	private int					income;	//�Ǳ޿� = �޿� - ����(�޿� * ���� )

	public String getName( )
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public int getSalary( )
	{
		return salary;
	}

	public void setSalary( int salary )
	{
		this.salary = salary;
	}

	public int getIncome( )
	{
		return income;
	}

	public void setIncome( int salary )
	{
		this.income = (int) (salary - (salary * Tax));
	}

}
