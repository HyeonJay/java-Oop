package test;

import java.util.Scanner;

public class PayMain
{
	public static void main( String[] args )
	{
		Scanner scanner = new Scanner(System.in);

		PayVO Hong = new PayVO();  // Ŭ������ ���� hong�̶�� ��ü ��������
		PayVO Kang = new PayVO();
		//����. === ȫ�浿�� 6�� �޿� ���� ===
		//���� : 300����
		//���� : 30����
		//�Ǳ޿� : 270����

		//=== �������� 6�� �޿� ���� ===
		//���� : 400����
		//���� : 40����
		//�Ǳ޿� : 360����

		System.out.print("�̸��� �Է����ּ���(ȫ�浿) : ");
		Hong.setName(scanner.next());
		System.out.print("������ �Է��� �ּ���(����) : ");
		Hong.setSalary(scanner.nextInt());
		Hong.setIncome(Hong.getSalary());

		System.out.println();
		System.out.println("=== " + Hong.getName() + "�� 6�� �޿� ���� ===");
		System.out.println("���� : " + Hong.getSalary() + "����");
		System.out.println("���� : " + Hong.getSalary()*PayVO.Tax+ "����"); 
		//�ν��Ͻ�(��) ���� : �ν��Ͻ�( hong, kang )�� getter�� setter�� ȣ���ϴ� �ʵ� ��
		//Ŭ����(��) ���� : Ŭ������ ���� ȣ���ϴ� �ʵ尪
	
		System.out.println("�Ǳ޿� : " + Hong.getIncome() + "����");
		System.out.println();

		System.out.print("�̸��� �Է����ּ���(������) : ");
		Kang.setName(scanner.next());
		System.out.print("������ �Է��� �ּ���(����) : ");
		Kang.setSalary(scanner.nextInt());
		Kang.setIncome(Kang.getSalary());

		System.out.println();
		System.out.println("=== " + Kang.getName() + "�� 6�� �޿� ���� ===");
		System.out.println("���� : " + Kang.getSalary() + "����");
		System.out.println("���� : " + Kang.getSalary()*PayVO.Tax + "����");
		System.out.println("�Ǳ޿� : " + Kang.getIncome() + "����");
	}
}
