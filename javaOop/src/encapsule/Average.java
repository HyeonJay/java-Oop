package encapsule;

import java.util.Scanner;

/*
 * @Date : 2015. 6. 17
 * @Author : itbank
 * @Story : ��ձ��ϴ� ������ ������������ �ڵ��� �ҽ�
 * */
public class Average
{
	public static void main(String[] args)
	{
		String hulk = " ", iron = " ", hwak = " ";

		int hulkKor = 0, hulkEng = 0, hulkTot = 0, hulkAvg = 0, ironKor = 0, ironEng = 0, ironTot = 0, ironAvg = 0, hwakKor = 0, hwakEng = 0, hwakTot = 0, hwakAvg = 0;

		/*
		 * ���ݱ��� ������ ���� ���������Դϴ�. ������ ����� ����( ������) �� ���� ������ �����ϴ�. �޼ҵ� ���ο� ����Ǹ� �������� �Դϴ�. ���������� Ư¡�� ������ �����ϴ�. 1. �ݵ�� �ʱ�ȭ�ؾ��� 2. ���� �޼ҵ� ���ο� ������ Ÿ���� ������ �̸���
		 * �� �� ����. 3. �޼ҵ尡 ������ ������ ���ŵ�
		 */
		Scanner scanner = new Scanner(System.in);

		/* �̸����� */
		hulk = "��ũ";
		iron = "���̾�";
		hwak = "ȣũ";

		/* �������� */
		System.out.print("��ũ�� �������� : ");
		hulkKor = scanner.nextInt();
		System.out.print("��ũ�� �������� : ");
		hulkEng = scanner.nextInt();

		System.out.print("���̾��� �������� : ");
		ironKor = scanner.nextInt();
		System.out.print("���̾��� �������� : ");
		ironEng = scanner.nextInt();

		System.out.print("ȣũ�� �������� : ");
		hwakKor = scanner.nextInt();
		System.out.print("ȣũ�� �������� : ");
		hwakEng = scanner.nextInt();

		/* ������ ��� ��� */
		hulkTot = hulkKor + hulkEng;
		hulkAvg = hulkTot / 2;

		ironTot = ironKor + ironEng;
		ironAvg = ironTot / 2;

		hwakTot = hwakKor + hwakEng;
		hwakAvg = hwakTot / 2;

		/* ��� */
		System.out.println("===" + hulk + "�� ����ǥ===");
		System.out.println("���� : " + hulkKor);
		System.out.println("���� : " + hulkEng);
		System.out.println("�հ� : " + hulkTot);
		System.out.println("��� : " + hulkAvg);
		System.out.println();

		/*
		 * ���ϴ� �ܾ ü�����ϴ� ��Ŭ���� ����Ű : CTRL + F replace ��ư Ŭ��
		 */
		System.out.println("===" + iron + "�� ����ǥ===");
		System.out.println("���� : " + ironKor);
		System.out.println("���� : " + ironEng);
		System.out.println("�հ� : " + ironTot);
		System.out.println("��� : " + ironAvg);
		System.out.println();

		System.out.println("===" + hwak + "�� ����ǥ===");
		System.out.println("���� : " + hwakKor);
		System.out.println("���� : " + hwakEng);
		System.out.println("�հ� : " + hwakTot);
		System.out.println("��� : " + hwakAvg);
		System.out.println();
	}
}
