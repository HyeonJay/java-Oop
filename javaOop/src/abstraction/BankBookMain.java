package abstraction;

import java.util.Scanner;

public class BankBookMain {
	public static void main( String[] args ) {
		Scanner scanner = new Scanner(System.in);
		int accountNo = (int) ((Math.random() * 999999) + 111110);
		//6자리 정수형 랜덤 숫자 발생
		// valueOf( )는 자바 API에 있는 java.lang.String 클래스의 메소드로 숫자형을 문자열로 바꿔주는 역할을 한다.

		String strAccountNo = String.valueOf(accountNo);
		System.out.print("예금주 이름 : ");
		String name = scanner.nextLine();

		System.out.print("비밀번호 : ");
		String pass = scanner.nextLine();

		System.out.print("예금액 : ");
		int inputMoney = scanner.nextInt();

		// 객체( 인스턴스 )를 생성할 때 아주 주의해야할 점.
		// 객체를 생성하는 클래스가 인터페이스를 구현한 것이 아니라면
		// 그대로 데이터 타입으로 사용해도 된다.
		// 하지만 인터페이스를 구현한 클래스라면
		// 인터페이스 타입 + 인스턴스 = new 클래스 생성자( ) 로
		// 객체를 생성한다.★★★★★
		Account hong = new BankBook(strAccountNo, name, pass, inputMoney);
		System.out.println(hong.toString());

		System.out.println();
		System.out.println(hong.toString());
		System.out.print("입금액 : ");
		int depositMoney = scanner.nextInt();
		hong.deposit(depositMoney); //파라미터를 던진다.
		System.out.println(hong.toString());

		System.out.println();
		int withdrawMoney = scanner.nextInt();
		System.out.println("출금액 : ");
		hong.withdraw(withdrawMoney);
		System.out.println(hong.toString());
	}

}
