package polymorphism;

import java.util.Scanner;

// @Date : 2015. 6. 19
// @Author : ITBANK
// @Story : Ŀ�� ��ü Ŭ������ ���� ������
// �ڡڡڡڡڿ����ε��� �����غ��� ���� Ŭ����
// �����ε� = ������( polymorphism )
public class CoffeeMain2 {
	public static void main( String[] args ) {
		CoffeeVO vendingMachine = new CoffeeVO();
		System.out.println(vendingMachine.getMsg());

		Scanner scanner = new Scanner(System.in);
		System.out.println("�Ǹ��ڴ� Ŀ�� ���� ������ ������ �ּ���. ");
		int price = scanner.nextInt();

		CoffeeVO coffeePrice = new CoffeeVO(price);
		System.out.println(coffeePrice.getMsg());
	}

}
