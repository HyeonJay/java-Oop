package encapsule;

import java.util.Scanner;

// @Date : 2015. 6. 18
// @Story : �簢���� ������ ���ϴ� ���α׷�

public class RectangleMain1
{
	public static void main( String[] args )
	{
		Scanner scanner = new Scanner(System.in);
		RectangleVO rectangle = new RectangleVO();

		System.out.println("���α��̸� �Է��ϼ��� : ");
		rectangle.setWidth(scanner.nextInt());

		System.out.println("���α��̸� �Է��ϼ��� :");
		rectangle.setHeight(scanner.nextInt());
		//������ ��������( ���� ���� )�� �������� �ʴ� ������ �ν��Ͻ��� ���� �ν��Ͻ� ������ �̿��ϱ� �����̴�.

		rectangle.setArea(rectangle.getWidth(), rectangle.getHeight());
		System.out.println("�簢���� ���� : "  + rectangle.getArea());

	}
}
