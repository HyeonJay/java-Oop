package inhebitance;

public class KiaMain {
	public static void main( String[] args ) {
	
		KiaCar K5 = new KiaCar();

		K5.setCompanyName("기아");
		K5.setCarName("K5");

		System.out.println(K5.getCompanyName() + "\t" + K5.getCarName() + "\t" + Car.CAR);
		//우측 노란색 경고창이 뜨는 이유는
		//문법적으로 크게 문제는 아니지만 ( 프로그램이 중단될 정도는 아니지만 )
		// 그렇다고 합법적인 코딩 방식도 아니다. 비권장 방식으로 코딩했다라는 의미
		//자바 개발자라면 이런 워닝 현상도 제거해야 한다.
		//위 상황이라면 CAR는 클래스 변수이지 인스턴스 변수가 아니기 때문에
		// 인스턴스로 호출하지 말고( k5... )클래스로 호출해라! ( Car.CAR )라는 뜻이다.
	}
}
