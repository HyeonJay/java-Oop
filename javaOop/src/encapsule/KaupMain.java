package encapsule;

import java.util.Scanner;

public class KaupMain
{
	public static void main(String[] args)
	{
		KaupVO kaupMain = new KaupVO();
		// 객체를 생성하는 패턴
		// 클래스명 객체 명 = new 생성자명
		Scanner scanner = new Scanner(System.in);

		System.out.println("키를 입력하세요.");
		double height = scanner.nextDouble();

		System.out.println("몸무게를 입력하세요.");
		double weight = scanner.nextDouble();

		String msg = kaupMain.getKaup(weight, height);
		// 객체명( =인스턴스 참조변수 = 참조변수 ). 메소드 이름
		// 객체가 메소드를 호출하는 패턴
		// height와 weight는 파라미터로 값을 전달하는 역할

		System.out.println("카우프지수[ 키 = " + height + "cm, 몸무게 = " + weight + "kg, 카우프지수 = " + msg + " ]");
	}
}
