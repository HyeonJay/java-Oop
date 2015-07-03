package abstraction;

public class Card {

	static final int			WIDTH	= 150;	// 카드이 가로
	static final int			HEIGHT	= 300;	// 카드의 높이
	//원래 트럼프는 4가지 무늬가 있는데 이 게임에서는 하트무늬만 가지고 플레이 한다.
	public static final String	KIND	= "하트";
	private int					num;

	public Card( ) {
		this.num = (int) ((Math.random()*13)+1);
		// Math클래스는 수학과 관련된 클래스 
		// Math.random( ) 메소드는 범위내에서  랜덤 숫자를
		//발생시키는 역할 
		//* 13 은 리미트 값, +1은 start 값
	}
	public int getNum( ) {
		return num;
	}

}