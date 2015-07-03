package inhebitance;

public class CelPhone extends Phone{
	private boolean	portable;	//휴대성이 있는지 없는지 여부
	private String	move;		//휴대성이 있다면 가지고 다닐 수 있다.

	// 디폴트 생성자를 만들지 않겠다.
	// ALT + SHIFT + S를 하는 것은 getter/setter 호출

	//필드에 있는 인스턴스 변수의 타입이 boolean인 경우
	//get ... set...이 아니라
	// is ... set...으로 자동생성된다.
	//이것은 오로지 boolean타입일 경우에만 해당된다.
	
	public boolean isPortable( ) {
		return portable;
	}

	public void setPortable( boolean portable ) {
		if (portable == true) { //port
			this.setMove("폰을 가지고 다닐 수 있음.");
		}
		else {
			this.setMove("폰을 가지고 다닐 수 없음.");
		}
	}

	public String getMove( ) {
		return move;
	}

	public void setMove( String move ) {
		this.move = move;
	}

}
