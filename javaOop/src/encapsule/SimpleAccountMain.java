package encapsule;

import java.util.Scanner;

public class SimpleAccountMain
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
/*
 * Scanner는 클래스, scanner는 인스턴스( 객체 ) 라고 부릅니다.
 * */
		SimpleAccountVO simpleAccountVO = new SimpleAccountVO();

		System.out.print("이름 : ");
		String name = scanner.next(); //문자열을 입력받을 때는 next( ) 사용함
		 
		System.out.print("입금할 금액 : ");
		int money = scanner.nextInt(); //숫자값을 입력받을 때는 nextInt( ) 사용함

		String name2 = simpleAccountVO.name(name);
		int jango = simpleAccountVO.jango(money);

		System.out.println(name2 + "씨 " + money + "만원 입금되었습니다." + "\n잔고는 " + jango + "만원입니다.");

	}
}
