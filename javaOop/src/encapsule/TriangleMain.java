package encapsule;

/*
 * @Date : 2015.6.19
 * @Author : itbank
 * @Story : 생성자만으로 삼각형 구하기
 */
import java.util.Scanner;

public class TriangleMain
{
	public static void main( String[] args )
	{

		Scanner scanner = new Scanner(System.in);

		System.out.print("가로길이 입력 : ");
		double garo = scanner.nextInt();

		System.out.print("세로길이 입력 : ");
		double sero = scanner.nextInt();

		// double타입의 파라미터에 int 타입의 값을 할당해도 아무문제가 발생하지 않는 것은
		// 자바 내부적으로 작은 타입은 큰 타입에 적용 가능하기 때문이다.
		
		//다만, 값의 손실은 피할 수 없다.

		TriangleVO triangle = new TriangleVO(garo, sero);

		System.out.print("삼각형의 면적 : " + triangle.getArea());

	}

}
