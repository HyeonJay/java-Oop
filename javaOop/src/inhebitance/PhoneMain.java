package inhebitance;

import java.util.Scanner;

public class PhoneMain {
	public static void main( String[] args ) {
		Phone phone = new Phone();
		//������ Ÿ�� + �Խ��Ͻ� =  new ������( );

		phone.setCompany("�ѱ� ���");
		System.out.println(phone.getCompany() + "�� ����ȭ�� ����մϴ�.");
		System.out.print("��ȭ�� ����� �̸� : ");
		Scanner scanner = new Scanner(System.in);
		phone.setCall(scanner.next());
		System.out.println(phone.getCall()+"�� ��ȭ�մϴ�.");
	}
}
