package encapsule;

import java.util.Scanner;

/*
 * @Date : 2015. 6. 16
 * @Author : ITBANK ������;
 * @ Stroy : ���� �޼ҵ忡�� ���ȭ ������ �и� ����;
 * */
public class LeapYearVO
{
	public String getLeapYear(int year)
	{
		/*
		 * ������ 4�� ���� ���� 0 �̶�� ������ �� �ִ�. �׷��� �ش� ������ 100���� ������ �������� ����̴� ����̶� �ص� �ٽ� 400���� ���������� ������ �����̴�
		 */
		String yearmsg = "";
	


		if (year % 400 == 0)
		{
			// ���͸� if������ ���ʴ�� ������� ���� �� ������ �Ǹ��ϸ鼭 �Ϻη� ���� �����ϴ� ����
			// ���͸� ����� ������� ũ�� �ִ� �������� ���� �������� ����.
			yearmsg = "����";
		}
		else if (year % 100 == 0)
		{
			yearmsg = "���";
		}
		else if (year % 4 == 0)
		{
			yearmsg = "����";
		}
		else
		{
			yearmsg = "���";
		}
		return yearmsg;
	}
/*
 * ��� ���� ������Ű�� ���ؼ��� �޼ҵ忡 ���� Ÿ���� void�� �ƴ� ���� ���� ���� ������ Ÿ���� �ָ�ȴ�.
 * */
}
