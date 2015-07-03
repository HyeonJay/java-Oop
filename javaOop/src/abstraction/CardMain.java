package abstraction;

public class CardMain {
	public static void main( String[] args ) {
		// 요구사항..
		// 카드 객체를 2개 생성해서 무늬와 숫자를 비교해서 더 큰 숫자를 가진 카드가 이기는 게임을 만드시오.
		// 카드는 생산과 동시에 무늬와 번호가 만들어져있다.
		// 현실과 같은 개념으로 프로그램을 만드세요.

		Card card1 = new Card();
		Card card2 = new Card();
		CardGame game = new CardGame();
		game.play(card1, card2);
		System.out.println("[카드1]" + Card.KIND + " : " + card1.getNum() + "\n" + "[카드2]" + Card.KIND + " : " + card2.getNum() + "\n"
					+ game.getResult());

	}

}

