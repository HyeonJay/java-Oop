package inhebitance;

import java.util.Scanner;

public class CelPhoneMain {
	public static void main( String[] args ) {
		CelPhone motorola = new CelPhone();
		motorola.setCompany("모토로라");
		System.out.println(motorola.getCompany() + "의 휴대폰을 사용합니다.");

		Scanner scanner = new Scanner(System.in);
		System.out.print("통화할 사람 : ");
		motorola.setCall(scanner.next());

		motorola.setPortable(true);
		System.out.println(motorola.getCall()+"와 통화 합니다." + "\n"+motorola.getMove());

	}
}
