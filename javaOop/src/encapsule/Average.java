package encapsule;

import java.util.Scanner;

/*
 * @Date : 2015. 6. 17
 * @Author : itbank
 * @Story : 평균구하는 로직을 절차지형으로 코딩한 소스
 * */
public class Average
{
	public static void main(String[] args)
	{
		String hulk = " ", iron = " ", hwak = " ";

		int hulkKor = 0, hulkEng = 0, hulkTot = 0, hulkAvg = 0, ironKor = 0, ironEng = 0, ironTot = 0, ironAvg = 0, hwakKor = 0, hwakEng = 0, hwakTot = 0, hwakAvg = 0;

		/*
		 * 지금까지 선언한 것은 지역변수입니다. 변수는 선언된 영역( 스코프) 에 따라 종류가 나뉩니다. 메소드 내부에 선언되면 지역변수 입니다. 지역변수의 특징은 다음과 같습니다. 1. 반드시 초기화해야함 2. 같은 메소드 내부에 동일한 타입의 동일한 이름을
		 * 줄 수 없음. 3. 메소드가 끝나면 변수는 제거됨
		 */
		Scanner scanner = new Scanner(System.in);

		/* 이름저장 */
		hulk = "헐크";
		iron = "아이언";
		hwak = "호크";

		/* 점수저장 */
		System.out.print("헐크의 국어점수 : ");
		hulkKor = scanner.nextInt();
		System.out.print("헐크의 영어점수 : ");
		hulkEng = scanner.nextInt();

		System.out.print("아이언의 국어점수 : ");
		ironKor = scanner.nextInt();
		System.out.print("아이언의 영어점수 : ");
		ironEng = scanner.nextInt();

		System.out.print("호크의 국어점수 : ");
		hwakKor = scanner.nextInt();
		System.out.print("호크의 영어점수 : ");
		hwakEng = scanner.nextInt();

		/* 총점과 평균 계산 */
		hulkTot = hulkKor + hulkEng;
		hulkAvg = hulkTot / 2;

		ironTot = ironKor + ironEng;
		ironAvg = ironTot / 2;

		hwakTot = hwakKor + hwakEng;
		hwakAvg = hwakTot / 2;

		/* 출력 */
		System.out.println("===" + hulk + "의 성적표===");
		System.out.println("국어 : " + hulkKor);
		System.out.println("영어 : " + hulkEng);
		System.out.println("합계 : " + hulkTot);
		System.out.println("평균 : " + hulkAvg);
		System.out.println();

		/*
		 * 원하는 단어만 체인지하는 이클립스 단축키 : CTRL + F replace 버튼 클릭
		 */
		System.out.println("===" + iron + "의 성적표===");
		System.out.println("국어 : " + ironKor);
		System.out.println("영어 : " + ironEng);
		System.out.println("합계 : " + ironTot);
		System.out.println("평균 : " + ironAvg);
		System.out.println();

		System.out.println("===" + hwak + "의 성적표===");
		System.out.println("국어 : " + hwakKor);
		System.out.println("영어 : " + hwakEng);
		System.out.println("합계 : " + hwakTot);
		System.out.println("평균 : " + hwakAvg);
		System.out.println();
	}
}
