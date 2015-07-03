package test;

import java.util.Scanner;

public class PayMain
{
	public static void main( String[] args )
	{
		Scanner scanner = new Scanner(System.in);

		PayVO Hong = new PayVO();  // 클래스를 통한 hong이라는 객체 생성문법
		PayVO Kang = new PayVO();
		//문제. === 홍길동의 6월 급여 내역 ===
		//본봉 : 300만원
		//세금 : 30만원
		//실급여 : 270만원

		//=== 강감찬의 6월 급여 내역 ===
		//본봉 : 400만원
		//세금 : 40만원
		//실급여 : 360만원

		System.out.print("이름을 입력해주세요(홍길동) : ");
		Hong.setName(scanner.next());
		System.out.print("본봉을 입력해 주세요(만원) : ");
		Hong.setSalary(scanner.nextInt());
		Hong.setIncome(Hong.getSalary());

		System.out.println();
		System.out.println("=== " + Hong.getName() + "의 6월 급여 내역 ===");
		System.out.println("본봉 : " + Hong.getSalary() + "만원");
		System.out.println("세금 : " + Hong.getSalary()*PayVO.Tax+ "만원"); 
		//인스턴스(의) 변수 : 인스턴스( hong, kang )가 getter와 setter로 호출하는 필드 값
		//클래스(의) 변수 : 클래스가 직접 호출하는 필드값
	
		System.out.println("실급여 : " + Hong.getIncome() + "만원");
		System.out.println();

		System.out.print("이름을 입력해주세요(강감찬) : ");
		Kang.setName(scanner.next());
		System.out.print("본봉을 입력해 주세요(만원) : ");
		Kang.setSalary(scanner.nextInt());
		Kang.setIncome(Kang.getSalary());

		System.out.println();
		System.out.println("=== " + Kang.getName() + "의 6월 급여 내역 ===");
		System.out.println("본봉 : " + Kang.getSalary() + "만원");
		System.out.println("세금 : " + Kang.getSalary()*PayVO.Tax + "만원");
		System.out.println("실급여 : " + Kang.getIncome() + "만원");
	}
}
