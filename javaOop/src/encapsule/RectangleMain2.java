package encapsule;

import java.util.Scanner;
	// @Date : 2015. 6. 18
	// @Story : �簢���� ������ ���ϴ� ���α׷�

public class RectangleMain2
{
	public static void main( String[] args )
	{/*�����ڷ� ���� ���ϱ�*/
	Scanner scanner = new Scanner( System.in);
	System.out.println("���α��� �Է� : ");
	int width = scanner.nextInt();
	
	System.out.println("���α��� �Է� : ");
	int height = scanner.nextInt();
	
	RectangleVO rectangle = new RectangleVO(width, height);
	System.out.println("���� : " + rectangle.getArea());

		
	}
}
