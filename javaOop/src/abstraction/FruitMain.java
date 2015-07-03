package abstraction;

public class FruitMain {
	public static void main( String[] args ) {
		// 인터 페이스는 객체를 만들 수 없다.
		// 즉, FruitInterface f = new FruitInerface( );
		// 이것은 에러를 발생시킨다

		FruitInterface apple = new AppleImpl();
		// 이처럼 타입 정의만 인터페이스로 하고
		// 생성자 메소드는 인터 페이스를 구현한 클래스를 가지고 
		// 객체를 생성한다.★★★★★
		// AppleImpl apple2 = new AppleImpl( );
		// 위 처럼 코딩하면 망한다.
		apple.display("맛있는 ");

		FruitInterface banana = new BananaImpl();
		banana.display("오래된 ");

		FruitInterface orange = new OrangeImpl();
		orange.display("비싼 ");
		//orange 클래스에 있는 getCount( )를 호출하고 싶다..
		//orange.getCount( ); // 이것은 정의는 되어 있으되 호출은 되지 않는다.
	
		// 위 처럼되는 이유는 주어진 역할( 룰 ) 만 수행하라는 뜻
		// 즉, 시키는 것 외에 쓸데없는 짓은 하지 말것
		// 프로그램을 망치기 때문에
	}
}
