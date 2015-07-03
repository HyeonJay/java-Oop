package encapsule;

import java.util.Scanner;

public class AverageMainStep2
{
	public static void main(String[] args)
	{
		// 현재 main( )는 AverageVOStep2의 객체( 인스턴스 )를
		// 사용할 것이므로 데이터 타입( =클래스명 ) 을
		// AverageVOStep2로 바꿔준다.
		AverageVOStep2 hulk = new AverageVOStep2();
		AverageVOStep2 iron = new AverageVOStep2();
		AverageVOStep2 hwak = new AverageVOStep2();

		Scanner scanner = new Scanner(System.in);

		/* 점수 저장 */
		hulk.name = "헐크";
		System.out.print("헐크의 국어점수 : ");
		hulk.kor = scanner.nextInt();
		System.out.print("헐크의 영어점수 : ");
		hulk.eng = scanner.nextInt();
		hulk.tot = hulk.calcTot(hulk.kor, hulk.eng);
		hulk.avg = hulk.calcAvg(hulk.tot);

		iron.name = "아이언";
		System.out.print("아이언의 국어점수 : ");
		iron.kor = scanner.nextInt();
		System.out.print("아이언의 영어점수 : ");
		iron.eng = scanner.nextInt();
		iron.tot = iron.calcTot(iron.kor, iron.eng);
		iron.avg = iron.calcAvg(iron.tot);

		hwak.name = "호크";
		System.out.print("호크의 국어점수 : ");
		hwak.kor = scanner.nextInt();
		System.out.print("호크의 영어점수 : ");
		hwak.eng = scanner.nextInt();
		hwak.tot = hwak.calcTot(hwak.kor, hwak.eng);
		hwak.avg = hwak.calcAvg(hwak.tot);

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
