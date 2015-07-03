package encapsule;

import java.util.Scanner;

// @Date : 2015. 6. 18
// @Story : 사각형의 면적을 구하는 프로그램

public class RectangleMain1
{
	public static void main( String[] args )
	{
		Scanner scanner = new Scanner(System.in);
		RectangleVO rectangle = new RectangleVO();

		System.out.println("가로길이를 입력하세요 : ");
		rectangle.setWidth(scanner.nextInt());

		System.out.println("세로길이를 입력하세요 :");
		rectangle.setHeight(scanner.nextInt());
		//별도로 지역변수( 로컬 변수 )를 선언하지 않는 이유는 인스턴스를 통한 인스턴스 변수를 이용하기 때문이다.

		rectangle.setArea(rectangle.getWidth(), rectangle.getHeight());
		System.out.println("사각형의 면적 : "  + rectangle.getArea());

	}
}
