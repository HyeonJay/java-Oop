package encapsule;

public class TriangleVO
{
	//Ŭ������ ��ɿ� ���� �ڵ������� ��������.
	// main( ) ������ �ִ� Ŭ������ ������ ����Ŭ������� �θ���.
	//main( )���� ���ο� �����Ϳ� �װ��� ó���ϴ� �����( statement )��
	//������ �ִ� Ŭ������ ��ü Ŭ������� �θ���

	//��ü Ŭ������ �ʵ念���� �������( = �ν��Ͻ� ���� + Ŭ���� ���� )
	// �� �޼��� ������ ��� �޼���� �����ȴ�.
	// �ű⿡ Ư���� �޼ҵ常 �����ڰ� ��� ��ġ�Ѵ�.

	private double	area;

	public TriangleVO( double garo, double sero )
	{
		this.area = (garo * sero) / 2;
	}

	public double getArea( )
	{
		return area;
	}

}
