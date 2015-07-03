package inhebitance;

public class CarMain {
	public static void main( String[] args ) {
		Car car = new Car();
		//클래스 명( 데이터 타입 ) 인스턴스 = new 생성자( );
		car.setCompanyName("현대차");
		System.out.println(car.getCompanyName());
	}

}
