package abstraction;

public class CartMain {
	public static void main( String[] args ) {
		TV samsumgTV = new TV();
		samsumgTV.setInfo("�Ｚ", "���̵�TV", "123-456", "42��ġ", "LCD");
		//samsumgTV.getInfo();
		System.out.println();

		Notebook lgNotebook = new Notebook();
		lgNotebook.setInfo("LG", "�׷�", "123-456", "ebdjfzhdj", "8G", "500GB");
		//	lgNotebook.getInfo();
		// �����ڸ� ������� �ʴ� �迭������ �������̽� Ÿ�����ε� �����ϴ�.

		Product cart[] = new Product[2];
		cart[0] = samsumgTV;
		cart[1] = lgNotebook;

		for (Product product : cart) {// cart�� �迭
			product.getInfo();
		}
		//getInfo�� ������ �ڵ��� �ʿ䰡 ���� for���� ������ָ� �����ϰ� �ذ�ȴ�.
	}
}
