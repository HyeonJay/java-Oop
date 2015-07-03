package polymorphism;

import java.util.Scanner;

// @Date : 2015. 6. 19
// @Author : ITBANK
// @Story : 커피 객체 클래스를 통해 생성자
// ★★★★★오버로딩을 이해해보는 실행 클래스
// 오버로딩 = 다형성( polymorphism )
public class CoffeeMain2 {
	public static void main( String[] args ) {
		CoffeeVO vendingMachine = new CoffeeVO();
		System.out.println(vendingMachine.getMsg());

		Scanner scanner = new Scanner(System.in);
		System.out.println("판매자님 커피 한잔 가격을 설정해 주세요. ");
		int price = scanner.nextInt();

		CoffeeVO coffeePrice = new CoffeeVO(price);
		System.out.println(coffeePrice.getMsg());
	}

}
