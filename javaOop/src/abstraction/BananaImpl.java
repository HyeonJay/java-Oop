package abstraction;

public class BananaImpl implements FruitInterface {

	@Override
	public void display( String str ) {
		System.out.println(str + "바나나 입니다.");
	}

}
