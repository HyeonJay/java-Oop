package encapsule;

import java.util.Scanner;

public class SimpleAccountMain
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
/*
 * Scanner�� Ŭ����, scanner�� �ν��Ͻ�( ��ü ) ��� �θ��ϴ�.
 * */
		SimpleAccountVO simpleAccountVO = new SimpleAccountVO();

		System.out.print("�̸� : ");
		String name = scanner.next(); //���ڿ��� �Է¹��� ���� next( ) �����
		 
		System.out.print("�Ա��� �ݾ� : ");
		int money = scanner.nextInt(); //���ڰ��� �Է¹��� ���� nextInt( ) �����

		String name2 = simpleAccountVO.name(name);
		int jango = simpleAccountVO.jango(money);

		System.out.println(name2 + "�� " + money + "���� �ԱݵǾ����ϴ�." + "\n�ܰ�� " + jango + "�����Դϴ�.");

	}
}
