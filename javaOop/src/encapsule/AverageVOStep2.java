package encapsule;

public class AverageVOStep2
{
	// Ŭ���� �ٷ� �ؿ� (�������� �ʵ�) ����� ������ �ν��Ͻ� ������ �ϸ� �� �ν��Ͻ� ������
	// �ʱ�ȭ�� �ص� �ǰ� ���ص� �Ǵµ�...
	// �������� ���Ǳ� ������ ��κ� �ʱ�ȭ�� ������� �ʴ´�.
	// �׸��� ���� �ʾƵ� ������ ������ �߻����� �ʴ´�.
	String name;
	int kor;
	int eng;
	int tot;
	double avg;

	/* �հ踦 ���ϴ� ����� main( )���� �����ͼ� ����� */
	public int calcTot(int kot, int eng)
	{
		// int tot = 0; // �̶� tot�� ���������̴�. ���� �ʱ�ȭ ���� �Է��ؾ���
		// �ּ� ����Ű : CTRL + SHIFT + /
		// �ּ� ���� : CTRL + SHIFT + \
		// tot = kor + eng;

		// return tot;

		return kor + eng;
	}

	/* ����� ���ϴ� ����� main( )���� �����ͼ� ����� */
	public double calcAvg(int tot)
	{
		// double avg = 0;
		// avg = tot / 2;

		// return avg;

		return tot / 2;
	}
	public String name ( String name)
	{
		return name;
	}
}
