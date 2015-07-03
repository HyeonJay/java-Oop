package abstraction;

public  class AppleImpl implements FruitInterface{

	@Override
	public void display( String str ) {
	System.out.println(str + "사과입니다.");
		
	}

}
