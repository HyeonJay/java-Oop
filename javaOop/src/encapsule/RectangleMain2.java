package encapsule;

import java.util.Scanner;
	// @Date : 2015. 6. 18
	// @Story : 사각형의 면적을 구하는 프로그램

public class RectangleMain2
{
	public static void main( String[] args )
	{/*생성자로 면적 구하기*/
	Scanner scanner = new Scanner( System.in);
	System.out.println("가로길이 입력 : ");
	int width = scanner.nextInt();
	
	System.out.println("세로길이 입력 : ");
	int height = scanner.nextInt();
	
	RectangleVO rectangle = new RectangleVO(width, height);
	System.out.println("면적 : " + rectangle.getArea());

		
	}
}
