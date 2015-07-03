package encapsule;

public class CardVO {

	String				msg;
	//카드의 가로와 높이는 일정해야 한다.
	// 즉, 고정값을 주어야한다.
	//결국 이는 상수로 선언해야 한다는 의미이다.
	//그래서 상수 선언 문법
	static final int	WIDTH	= 150;	// 카드이 가로
	static final int	HEIGHT	= 300;	// 카드의 높이

	public CardVO( String kind, int num ) {
		this.msg = kind + " : " + num;
	}

	// msg의 setMsg( )를 지운다는 것은 
	//임의로 메시지를 바꿀 수 없고
	// 단지 읽어오기만 한다는 read only의 의미이다.
	public String getMsg( ) {
		return msg;
	}

}