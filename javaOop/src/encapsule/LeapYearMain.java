package encapsule;

/*
 * @Date : 2015. 6. 16
 * @Author : ITBANK 구로점;
 * @ Stroy : main( )는 콘솔창에 입력과 출력의 기능을 담당한다. 따라서 Scanner는 main( )에 종속되어야 한다.;
 * */
import java.util.Scanner;

public class LeapYearMain
{
	// 메소드 구성 형태 : 접근 제한자 + 리턴 타입 + 메소드 이름 +( ) + { }
	// ( ) 은 파라미터( 매개 변수 ) 가 들어오는 위치. 빈 공간일 경우도 있음
	// { } 은 메소드 바디라고 부르며 구문( statement )가 위치함.
	// 접근제한자는 권한( 커미션 )을 구분하는 역할
	// 리턴 타입은 메소드가 반환하는 값이 있을 경우 설정하고
	// 없으면 void

	public static void main(String[] args)
	{
		LeapYearVO leapYearMain = new LeapYearVO();

		Scanner scanner = new Scanner(System.in);

		System.out.print("년도를 입력하세요 :");
		int year = scanner.nextInt();
		// Scanner는 클래스 이름
		// scanner는 인스턴스 변수 이름 ==> 객체명
		// new는 생성자 키워드
		// Scanner( ) 는 생성자
		// System.in 은 파라미터 ( 매개 변수 )
		/*
		 * 클래스 이름은 반드시 로직이 담겨있는 클래스 이름과 일치해야 하고, 객체( 인스턴스 변수 )는 클래스 이름과 관련이 없어도 된다. 다만, 메소드를 호출할 경우 선언된 인스턴스 변수명과는 일치해야한다.
		 */
		String msg = leapYearMain.getLeapYear(year); // 파라미터로 값을 전달한다.

		System.out.println(msg);
	}
}
