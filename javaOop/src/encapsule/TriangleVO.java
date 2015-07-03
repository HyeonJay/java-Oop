package encapsule;

public class TriangleVO
{
	//클래스는 기능에 따라 코딩패턴이 정해진다.
	// main( ) 가지고 있는 클래스를 앞으로 실행클래스라고 부른다.
	//main( )없이 내부에 데이터와 그것을 처리하는 연산식( statement )를
	//가지고 있는 클래스를 객체 클래스라고 부른다

	//객체 클래스는 필드영역에 멤버변수( = 인스턴스 변수 + 클래스 변수 )
	// 와 메서드 영역에 멤버 메서드로 구성된다.
	// 거기에 특수한 메소드만 생성자가 가운데 위치한다.

	private double	area;

	public TriangleVO( double garo, double sero )
	{
		this.area = (garo * sero) / 2;
	}

	public double getArea( )
	{
		return area;
	}

}
