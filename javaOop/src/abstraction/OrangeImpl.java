package abstraction;

public class OrangeImpl implements FruitInterface {
	// 구현한 메소드
	@Override
	public void display( String str ) {
		System.out.println(str + "오렌지 입니다.");

	}

	//인터 페이스에 정의된 추상클래스가 아닌 구현된 클래스에서 추가로 메소드를 더 만들었다.
	public int getCount( ) {
		return 100;
	}
}
