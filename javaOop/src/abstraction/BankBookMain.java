package abstraction;

import java.util.Scanner;

public class BankBookMain {
	public static void main( String[] args ) {
		Scanner scanner = new Scanner(System.in);
		int accountNo = (int) ((Math.random() * 999999) + 111110);
		//6�ڸ� ������ ���� ���� �߻�
		// valueOf( )�� �ڹ� API�� �ִ� java.lang.String Ŭ������ �޼ҵ�� �������� ���ڿ��� �ٲ��ִ� ������ �Ѵ�.

		String strAccountNo = String.valueOf(accountNo);
		System.out.print("������ �̸� : ");
		String name = scanner.nextLine();

		System.out.print("��й�ȣ : ");
		String pass = scanner.nextLine();

		System.out.print("���ݾ� : ");
		int inputMoney = scanner.nextInt();

		// ��ü( �ν��Ͻ� )�� ������ �� ���� �����ؾ��� ��.
		// ��ü�� �����ϴ� Ŭ������ �������̽��� ������ ���� �ƴ϶��
		// �״�� ������ Ÿ������ ����ص� �ȴ�.
		// ������ �������̽��� ������ Ŭ�������
		// �������̽� Ÿ�� + �ν��Ͻ� = new Ŭ���� ������( ) ��
		// ��ü�� �����Ѵ�.�ڡڡڡڡ�
		Account hong = new BankBook(strAccountNo, name, pass, inputMoney);
		System.out.println(hong.toString());

		System.out.println();
		System.out.println(hong.toString());
		System.out.print("�Աݾ� : ");
		int depositMoney = scanner.nextInt();
		hong.deposit(depositMoney); //�Ķ���͸� ������.
		System.out.println(hong.toString());

		System.out.println();
		int withdrawMoney = scanner.nextInt();
		System.out.println("��ݾ� : ");
		hong.withdraw(withdrawMoney);
		System.out.println(hong.toString());
	}

}
