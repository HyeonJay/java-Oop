package abstraction;

// @Date : 2015. 6. 24
// @Story : 인터페이스 타입으로 생성된 통장 클래스
public class BankBook implements Account {

	private String				accountNo;				//계좌번호
	private String				ownerName;				//계좌주인
	private String				password;				//통장비번
	private int					restMoney;				//잔액
	public static final String	BANK_NAME	= "아이티뱅크";

	public BankBook( String accountNo, String ownerName, String password, int restMoney ) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.password = password;
		this.restMoney = restMoney;
	}

	public String getAccountNo( ) {
		return accountNo;
	}

	public String getOwnerName( ) {
		return ownerName;
	}

	public String getPassword( ) {
		return password;
	}

	public void setPassword( String password ) {
		this.password = password;
	}

	public int getRestMoney( ) {
		return restMoney;
	}

	@Override
	public void deposit( int money ) {
		// 유효성 체크
		// 입금액이 혹시 0이나 0보다 작은 금액을 파라미터로 던질 경우 에러가 발생하는 것을 막기위한 방어코딩
		if (money <= 0) {
			System.out.println("입금액은 0보다 커야 합니다.");
		}

		else {
			this.restMoney += money;
		}
	}

	@Override
	public void withdraw( int money ) {
		if (money <= 0) {
			System.out.println("출금액은 0보다 커야 합니다.");
		}
		else if (getRestMoney() <= money) {
			System.out.println("출금액이 잔액보다 큽니다.");
		}
		else {
			this.restMoney -= money;
		}
	}

	//Java 에서는 자주 사용되는 클래스와 인터 페이스를 이미 생성 또는 구현한 뒤 개발자들이 이를 가져다 쓰게끔 하고 있다.
	// 예를 들면, 스캐너 , 시스템 같은 것들이다.
	// 이처럼 미리 만들어지 클래스와 인터 페이스를  API라고 한다.
	// 그 중 최상위 객체를 Object라고 하며, 이 Object의 클래스는 자바에서 객체로 선언된 것이라면 무조건 상속을 받는다.
	// 그래서 Object의 메소드들은 자바객체라면 어느것이든 사용할 수 있다.
	// 이걸 사용하는 방법은 클래스 내부에서 빈 공간에  CTRL + SPACE 

	@Override
	public String toString( ) {
		return "입출금 계좌\n" + "[" + BANK_NAME + "]\n" + "계좌번호 : " + getAccountNo() + "\n" + "계좌명 : " + getOwnerName() + "\n" + "비밀번호 : "
					+ "*********\n" + "잔액 : " + getRestMoney() + "\n" + "으로 통장이 개설되었습니다.";
	}
}
