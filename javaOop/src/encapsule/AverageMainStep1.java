package encapsule;

import java.util.Scanner;

public class AverageMainStep1
{
	public static void main(String[] args)
	{
		/* �л� ��ü���� �� �޸� �Ҵ� */
		// ��ü ������� �޸� �Ҵ��� ���� ���� ��������� �����ϰ� �Ѵ�.

		AverageVOStep1 hulk = new AverageVOStep1();
		AverageVOStep1 iron = new AverageVOStep1();
		AverageVOStep1 hwak = new AverageVOStep1();

		hulk.name = "��ũ";
		iron.name = "���̾�";
		hwak.name = "ȣũ";

		Scanner scanner = new Scanner(System.in);

		/* ���� ���� */
		System.out.print("��ũ�� �������� : ");
		hulk.kor = scanner.nextInt();
		System.out.print("��ũ�� �������� : ");
		hulk.eng = scanner.nextInt();

		System.out.print("���̾��� �������� : ");
		iron.kor = scanner.nextInt();
		System.out.print("���̾��� �������� : ");
		iron.eng = scanner.nextInt();

		System.out.print("ȣũ�� �������� : ");
		hwak.kor = scanner.nextInt();
		System.out.print("ȣũ�� �������� : ");
		hwak.eng = scanner.nextInt();

		/* ������ ��� ��� */
		hulk.tot = hulk.kor + hulk.eng;
		hulk.avg = hulk.tot / 2;

		iron.tot = iron.kor + iron.eng;
		iron.avg = iron.tot / 2;

		hwak.tot = hwak.kor + hwak.eng;
		hwak.avg = hwak.tot / 2;

		/* ��� */
		System.out.println("===" + hulk.name + "�� ����ǥ===");
		System.out.println("���� : " + hulk.kor);
		System.out.println("���� : " + hulk.eng);
		System.out.println("�հ� : " + hulk.tot);
		System.out.println("��� : " + hulk.avg);
		System.out.println();

		// ���ϴ� �ܾ ü�����ϴ� ��Ŭ���� ����Ű : CTRL + F replace ��ư Ŭ��

		System.out.println("===" + iron.name + "�� ����ǥ===");
		System.out.println("���� : " + iron.kor);
		System.out.println("���� : " + iron.eng);
		System.out.println("�հ� : " + iron.tot);
		System.out.println("��� : " + iron.avg);
		System.out.println();

		System.out.println("===" + hwak.name + "�� ����ǥ===");
		System.out.println("���� : " + hwak.kor);
		System.out.println("���� : " + hwak.eng);
		System.out.println("�հ� : " + hwak.tot);
		System.out.println("��� : " + hwak.avg);
		System.out.println();
	}
}
