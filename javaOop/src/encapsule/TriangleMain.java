package encapsule;

/*
 * @Date : 2015.6.19
 * @Author : itbank
 * @Story : �����ڸ����� �ﰢ�� ���ϱ�
 */
import java.util.Scanner;

public class TriangleMain
{
	public static void main( String[] args )
	{

		Scanner scanner = new Scanner(System.in);

		System.out.print("���α��� �Է� : ");
		double garo = scanner.nextInt();

		System.out.print("���α��� �Է� : ");
		double sero = scanner.nextInt();

		// doubleŸ���� �Ķ���Ϳ� int Ÿ���� ���� �Ҵ��ص� �ƹ������� �߻����� �ʴ� ����
		// �ڹ� ���������� ���� Ÿ���� ū Ÿ�Կ� ���� �����ϱ� �����̴�.
		
		//�ٸ�, ���� �ս��� ���� �� ����.

		TriangleVO triangle = new TriangleVO(garo, sero);

		System.out.print("�ﰢ���� ���� : " + triangle.getArea());

	}

}
