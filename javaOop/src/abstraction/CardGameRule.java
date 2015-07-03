package abstraction;

public abstract class CardGameRule {
	private String	result; // 카드 결과를 보여줌

	// 생성자 생략

	public String getResult( ) {
		return result;
	}

	public void setResult( String result ) {
		this.result = result;
	}

	public abstract void play( Card card1, Card card2 );
	// 메소드에 abstract를 붙이면 클래스에도 abstract이 붙어야 하며
	// 이 클래스를 추상 클래스라고 한다.
	// 그리고 abstract이 붙은 메소드를 추상 메소드라고 한다.
	// 추상 메소드는 바디가 없다.
}
