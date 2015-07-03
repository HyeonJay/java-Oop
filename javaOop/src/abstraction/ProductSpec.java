package abstraction;

public class ProductSpec implements Product {

	private String	company;	// 제조사
	private String	name;		// 제품명
	private String	serialNo;	// 일련번호

	@Override
	public void setInfo( String company, String name, String seialNo ) {
		this.company = company;
		this.name = name;
		this.serialNo = seialNo;
	}

	@Override
	public void getInfo( ) {
		// TODO Auto-generated method stub
		System.out.println("제조사 : " + this.company);
		System.out.println("제품명 : " + this.name);
		System.out.println("시리얼넘버 : " + this.serialNo);
	}


}
// 이클립스 단축키 사용자 정의 방법( 기본 단축키외에 추가시키기)
// 메뉴바 > Window > preference > general > key > copy line 입력 > CTRL + J
// delete line입력 > CTRL + D