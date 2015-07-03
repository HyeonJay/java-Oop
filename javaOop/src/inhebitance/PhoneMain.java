package inhebitance;

import java.util.Scanner;

public class PhoneMain {
	public static void main( String[] args ) {
		Phone phone = new Phone();
		//데이터 타입 + 입스턴스 =  new 생성자( );

		phone.setCompany("한국 통신");
		System.out.println(phone.getCompany() + "의 집전화을 사용합니다.");
		System.out.print("통화할 사람의 이름 : ");
		Scanner scanner = new Scanner(System.in);
		phone.setCall(scanner.next());
		System.out.println(phone.getCall()+"와 통화합니다.");
	}
}
