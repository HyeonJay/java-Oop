package encapsule;

import java.util.Scanner;

public class AverageMainStep3
{
	public static void main(String[] args)
	{
		AverageVOStep3 hulk = new AverageVOStep3();
		AverageVOStep3 iron = new AverageVOStep3();
		AverageVOStep3 hawk = new AverageVOStep3();
		// AverageVOStep3은 클래스 이름
		// hulk, iron, hawk는 인스턴스( 객체 )
		// new는 생성자 키워드
		// AverageVOStep3( )클래스 이름과 동일하지만 끝에 메소드 표시( )가 있는 것은
		// 생성자
		Scanner scanner = new Scanner(System.in);

		System.out.print("이름을 입력해주세요(헐크) : ");
		hulk.setName(scanner.next());
		System.out.print("이름을 입력해주세요(아이언) : ");
		iron.setName(scanner.next());
		System.out.print("이름을 입력해주세요(호크) : ");
		hawk.setName(scanner.next());

		/* 점수 저장 */
		System.out.print("헐크의 국어점수 : ");
		hulk.setKor(scanner.nextInt());
		System.out.print("헐크의 영어점수 : ");
		hulk.setEng(scanner.nextInt());

		System.out.print("아이언의 국어점수 : ");
		iron.setKor(scanner.nextInt());
		System.out.print("아이언의 영어점수 : ");
		iron.setEng(scanner.nextInt());

		System.out.print("호크의 국어점수 : ");
		hawk.setKor(scanner.nextInt());
		System.out.print("호크의 영어점수 : ");
		hawk.setEng(scanner.nextInt());

		/* 총점과 평균 */
		hulk.setTot(hulk.getKor(), hulk.getEng());
		iron.setTot(iron.getKor(), iron.getEng());
		hawk.setTot(hawk.getKor(), hawk.getEng());

		hulk.setAvg(hulk.getTot());
		iron.setAvg(iron.getTot());
		hawk.setAvg(hawk.getTot());

		/* 출력 */
		System.out.println("===" + hulk.getName() + "의 성적표===");
		System.out.println("국어 : " + hulk.getKor());
		System.out.println("영어 : " + hulk.getEng());
		System.out.println("합계 : " + hulk.getTot());
		System.out.println("평균 : " + hulk.getAvg());
		System.out.println();

		System.out.println("===" + iron.getName() + "의 성적표===");
		System.out.println("국어 : " + iron.getKor());
		System.out.println("영어 : " + iron.getEng());
		System.out.println("합계 : " + iron.getTot());
		System.out.println("평균 : " + iron.getAvg());
		System.out.println();

		System.out.println("===" + hawk.getName() + "의 성적표===");
		System.out.println("국어 : " + hawk.getKor());
		System.out.println("영어 : " + hawk.getEng());
		System.out.println("합계 : " + hawk.getTot());
		System.out.println("평균 : " + hawk.getAvg());
		System.out.println();

	}
}
