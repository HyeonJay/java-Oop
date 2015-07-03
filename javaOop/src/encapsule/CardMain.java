package encapsule;

public class CardMain {
	public static void main( String[] args ) {
		// 요구사항..
		// 카드 객체를 2개 생성해서 무늬와 숫자를 비교해서 더 큰 숫자를 가진 카드가 이기는 게임을 만드시오.
		// 카드는 생산과 동시에 무늬와 번호가 만들어져있다.
		// 현실과 같은 개념으로 프로그램을 만드세요.
		
		CardVO card1 = new CardVO("heart", 5);
		CardVO card2 = new CardVO("heart", 7);
		
		System.out.println("플레이어2가 낸 카드는 " + card2.getMsg() +"이고, 플레이어1이 낸 카드는 " + card1.getMsg()+"이므로 플레이어 2가 이겼습니다.");
	}

	
}
