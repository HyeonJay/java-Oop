package polymorphism;

public class CoffeeVO {
	private String	msg;
	int				price, money;	//동일 타입 변수선언 방식

	public CoffeeVO( ) {
		this.msg = "커피 자판기입니다.";
	}

	public CoffeeVO( int price ) {
		//this.price는 위쪽 필드에 선언된 인스턴스 변수이고,
		// = price에 있는 값은 생성자메소드에 파라미터로 넘어 온 값이다.
		//따라서 아래 구문은 인스턴스변수에 파라미터 값을 할당한다는 의미이다.
		this.price = price;
		this.msg = "한잔에 " + price + "원 입니다.";
	}

	public CoffeeVO( int price, int money, String coffee ) {
		this.msg = coffee + "나왔습니다.\n" + "거스름 돈은" + (money - price) + "원 입니다.";
	}

	public String getMsg( ) {
		return msg;
	}
}
