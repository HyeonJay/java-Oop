package encapsule;

import java.util.Scanner;

public class AverageMainStep2
{
	public static void main(String[] args)
	{
		// ���� main( )�� AverageVOStep2�� ��ü( �ν��Ͻ� )��
		// ����� ���̹Ƿ� ������ Ÿ��( =Ŭ������ ) ��
		// AverageVOStep2�� �ٲ��ش�.
		AverageVOStep2 hulk = new AverageVOStep2();
		AverageVOStep2 iron = new AverageVOStep2();
		AverageVOStep2 hwak = new AverageVOStep2();

		Scanner scanner = new Scanner(System.in);

		/* ���� ���� */
		hulk.name = "��ũ";
		System.out.print("��ũ�� �������� : ");
		hulk.kor = scanner.nextInt();
		System.out.print("��ũ�� �������� : ");
		hulk.eng = scanner.nextInt();
		hulk.tot = hulk.calcTot(hulk.kor, hulk.eng);
		hulk.avg = hulk.calcAvg(hulk.tot);

		iron.name = "���̾�";
		System.out.print("���̾��� �������� : ");
		iron.kor = scanner.nextInt();
		System.out.print("���̾��� �������� : ");
		iron.eng = scanner.nextInt();
		iron.tot = iron.calcTot(iron.kor, iron.eng);
		iron.avg = iron.calcAvg(iron.tot);

		hwak.name = "ȣũ";
		System.out.print("ȣũ�� �������� : ");
		hwak.kor = scanner.nextInt();
		System.out.print("ȣũ�� �������� : ");
		hwak.eng = scanner.nextInt();
		hwak.tot = hwak.calcTot(hwak.kor, hwak.eng);
		hwak.avg = hwak.calcAvg(hwak.tot);

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
