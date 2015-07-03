package abstraction;

public class TV extends ProductSpec {
	private String	screenSize;
	private String	screenType;

	public void setInfo( String company, String name, String seialNo, String screenSize, String screenType ) {

		super.setInfo(company, name, seialNo);
		this.screenSize = screenSize;
		this.screenType = screenType;
	}

	@Override
	public void getInfo( ) {
		super.getInfo();
		System.out.println("스크린 사이즈 : " + this.screenSize);
		System.out.println("스크린 타입 : " + this.screenType);

	}
}
