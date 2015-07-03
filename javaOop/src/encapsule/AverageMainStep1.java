package encapsule;

import java.util.Scanner;

public class AverageMainStep1
{
	public static void main(String[] args)
	{
		/* 학생 객체생성 및 메모리 할당 */
		// 객체 지향언어는 메모리 할당을 통해 값의 공유기능을 가능하게 한다.

		AverageVOStep1 hulk = new AverageVOStep1();
		AverageVOStep1 iron = new AverageVOStep1();
		AverageVOStep1 hwak = new AverageVOStep1();

		hulk.name = "헐크";
		iron.name = "아이언";
		hwak.name = "호크";

		Scanner scanner = new Scanner(System.in);

		/* 점수 저장 */
		System.out.print("헐크의 국어점수 : ");
		hulk.kor = scanner.nextInt();
		System.out.print("헐크의 영어점수 : ");
		hulk.eng = scanner.nextInt();

		System.out.print("아이언의 국어점수 : ");
		iron.kor = scanner.nextInt();
		System.out.print("아이언의 영어점수 : ");
		iron.eng = scanner.nextInt();

		System.out.print("호크의 국어점수 : ");
		hwak.kor = scanner.nextInt();
		System.out.print("호크의 영어점수 : ");
		hwak.eng = scanner.nextInt();

		/* 총점과 평균 계산 */
		hulk.tot = hulk.kor + hulk.eng;
		hulk.avg = hulk.tot / 2;

		iron.tot = iron.kor + iron.eng;
		iron.avg = iron.tot / 2;

		hwak.tot = hwak.kor + hwak.eng;
		hwak.avg = hwak.tot / 2;

		/* 출력 */
		System.out.println("===" + hulk.name + "의 성적표===");
		System.out.println("국어 : " + hulk.kor);
		System.out.println("영어 : " + hulk.eng);
		System.out.println("합계 : " + hulk.tot);
		System.out.println("평균 : " + hulk.avg);
		System.out.println();

		// 원하는 단어만 체인지하는 이클립스 단축키 : CTRL + F replace 버튼 클릭

		System.out.println("===" + iron.name + "의 성적표===");
		System.out.println("국어 : " + iron.kor);
		System.out.println("영어 : " + iron.eng);
		System.out.println("합계 : " + iron.tot);
		System.out.println("평균 : " + iron.avg);
		System.out.println();

		System.out.println("===" + hwak.name + "의 성적표===");
		System.out.println("국어 : " + hwak.kor);
		System.out.println("영어 : " + hwak.eng);
		System.out.println("합계 : " + hwak.tot);
		System.out.println("평균 : " + hwak.avg);
		System.out.println();
	}
}
