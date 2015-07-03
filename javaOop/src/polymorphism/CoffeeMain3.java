package polymorphism;

// @Date : 2015. 6. 19
// @Author : ITBANK
// @Story : 커피 객체 클래스를 통해 생성자
// 아래 예처럼 하나의 클래스를 가지고 계속 반복해서 서로 다른 객체를
// 생성한 후 여러번 기능에 따라 반복 사용하는 것을
// [생성자] 오버로딩이라고 한다
// 아래 예에서는 생성자를 여러번 반복했으므로 생성자 오버로딩이고
// 만약 메소드 파라미터만 다른 형태로 여러개의 동일 이름으로 선언 하였다면
// 이를 [메소드]오버로딩이라고 한다.
import java.util.Scanner;

public class CoffeeMain3 {
	public static void main( String[] args ) {
		CoffeeVO vendingMachine = new CoffeeVO();
		System.out.println(vendingMachine.getMsg());

		Scanner scanner = new Scanner(System.in);
		System.out.println("판매자님 커피 한잔 가격을 설정해 주세요. ");
		int price = scanner.nextInt();

		CoffeeVO coffeePrice = new CoffeeVO(price);
		System.out.println(coffeePrice.getMsg());

		System.out.println("고객님, 돈을 투입하세요. " + "\n한잔 가격은 " + price + "입니다.");
		int money = scanner.nextInt();

		System.out.println("커피 종류를 선택해 주세요. ");
		String coffeeType = scanner.next();

		CoffeeVO coffee = new CoffeeVO(price, money, coffeeType);
		System.out.println(coffee.getMsg());
	}

}
