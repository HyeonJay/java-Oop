package encapsule;

/*
 * @Story : ī��Ǫ������ �����ִ� ��� ( ������Ʈ )
 * */
public class KaupVO
{
	// �޼ҵ� = ����������( public ) + ����( void ) + �޼ҵ��̸� + ( ) + { }
	public String getKaup(double weight, double height)
	{
		/*
		 * �Ʒ����� doubleŸ���� ������� int Ÿ���� ������ �Ҵ��ؾ� �ϹǷ� ĳ������ �Ͼ����, ���� ��Ŭ������ �����ϴ� �ڵ� �ϼ� ������� �ذ��Ѵ�.
		 */
		int idx = (int) ((weight / (height * height)) * 10000);

		String msg = "";

		if (idx > 30)
			msg = "��";

		else if (idx > 24 && idx <= 30)
			msg = "��ü��";

		else if (idx > 20 && idx <= 24)
			msg = "����";

		else if (idx > 15 && idx <= 20)
			msg = "��ü��";

		else if (idx > 13 && idx <= 15)
			msg = "����";

		else if (idx > 10 && idx <= 13)
			msg = "�������";

		else
			msg = "�Ҹ���";

		return msg;

	}
}
