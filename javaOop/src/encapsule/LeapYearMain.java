package encapsule;

/*
 * @Date : 2015. 6. 16
 * @Author : ITBANK ������;
 * @ Stroy : main( )�� �ܼ�â�� �Է°� ����� ����� ����Ѵ�. ���� Scanner�� main( )�� ���ӵǾ�� �Ѵ�.;
 * */
import java.util.Scanner;

public class LeapYearMain
{
	// �޼ҵ� ���� ���� : ���� ������ + ���� Ÿ�� + �޼ҵ� �̸� +( ) + { }
	// ( ) �� �Ķ����( �Ű� ���� ) �� ������ ��ġ. �� ������ ��쵵 ����
	// { } �� �޼ҵ� �ٵ��� �θ��� ����( statement )�� ��ġ��.
	// ���������ڴ� ����( Ŀ�̼� )�� �����ϴ� ����
	// ���� Ÿ���� �޼ҵ尡 ��ȯ�ϴ� ���� ���� ��� �����ϰ�
	// ������ void

	public static void main(String[] args)
	{
		LeapYearVO leapYearMain = new LeapYearVO();

		Scanner scanner = new Scanner(System.in);

		System.out.print("�⵵�� �Է��ϼ��� :");
		int year = scanner.nextInt();
		// Scanner�� Ŭ���� �̸�
		// scanner�� �ν��Ͻ� ���� �̸� ==> ��ü��
		// new�� ������ Ű����
		// Scanner( ) �� ������
		// System.in �� �Ķ���� ( �Ű� ���� )
		/*
		 * Ŭ���� �̸��� �ݵ�� ������ ����ִ� Ŭ���� �̸��� ��ġ�ؾ� �ϰ�, ��ü( �ν��Ͻ� ���� )�� Ŭ���� �̸��� ������ ��� �ȴ�. �ٸ�, �޼ҵ带 ȣ���� ��� ����� �ν��Ͻ� ��������� ��ġ�ؾ��Ѵ�.
		 */
		String msg = leapYearMain.getLeapYear(year); // �Ķ���ͷ� ���� �����Ѵ�.

		System.out.println(msg);
	}
}
