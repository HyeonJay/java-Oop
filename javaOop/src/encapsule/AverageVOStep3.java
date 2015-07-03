package encapsule;

/*
 * @Date : 2015. 6. 18
 * @Author : ITBANK
 * @Story : ����ȭ�� ���� ����, ����ȭ�� �ʵ忡 �ִ� ������ ���� �ƹ��� �������� ���ϰ��ϰ� getter�� setter�� ���� ����( �۹̼� )�� ȹ���� ��ü�� �����Ϳ� �����ϵ����ϴ� �����̴�.
 */
/*
 * ���������� private - ���ȼ��� ����. ������Ʈ�� �������� ����� - ���۳�Ʈ�� ������ �ּ�ȭ�Ͽ� �������� ������ �� ���� - ������ ����
 */
public class AverageVOStep3
{
	private String	name;
	private int		kor;
	private int		eng;
	private int		tot;	// �ʵ忡 �ִ� �ν��Ͻ� ����
	private double	avg;

	// �޼ҵ���� �����ϴ� ������ ���� �ִ� �ʵ� ������
	// �����ؼ� �ʿ��� ����� �ϵ��� �� ���� ������,
	// ���ȿ� ��������� ������ �߻��Ѵ�.
	// �� , �ʵ忡 �ִ� ������ ������ �����ؼ� �б�� ����( ������ ���� )�� �����ϰ�
	// ���� ������ �� �� ���� �ؾ��Ѵ�,
	// readOnly��� ����� ȣũ�� ���� ������ ��ũ�� �����Ͽ� �ٲ� �� �ִ� ���� Step2�� ����
	// ���� ����� �ٽ� �и��� �б�� ���� ������� ������,
	// �̶� �б⸦ get~( )�̶�� �ϰ� ���⸦ set~()�̶�� �Ѵ�. ==> !!! ���� �߿� : ���а�( ĸ��ȭ ) �̴�.
	// ��Ŭ���������� �ʵ尪�� ���� �޼ҵ忡 �̸��� �ִ� ���� �ڵ�ȭ �ߴ�.
	// getter(�бⰡ��) �� setter(���Ⱑ��)�� �޼ҵ带 �ڵ����� ������ �ش�.
	// ������ ALT + SHIFT + S ����
	// generate getter and setter�� �����ϸ� �ȴ�.
	public String getName( )
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public int getKor( )
	{
		return kor;
	}

	public void setKor( int kor )
	{
		this.kor = kor;
	}

	public int getEng( )
	{
		return eng;
	}

	public void setEng( int eng )
	{
		this.eng = eng;
	}

	public int getTot( )
	{
		return tot;
	}

	public void setTot( int kor, int eng )
	{
		this.tot = kor + eng;

		// �ڵ����� ��Ŭ������ ���ؼ� �޼ҵ�� ����Ÿ��, �Ķ���͸� ������Ų ��,
		// ������ �ʿ信 ���� �ణ���� �����ϴ� �̼������� ����
		// �ڵ��� �ϼ��ϸ� �ȴ�.

	}

	public double getAvg( )
	{
		return avg;
	}

	public void setAvg( double avg )
	{
		this.avg = tot / 2; // ���� �ִ� double avg�� ����( this.avg )��
	}

}
// ���������� ���� ����� ����
// �׷��� main mathod������ this�� ���� ����.
