package encapsule;

/*
 * @Date : 2015. 6. 18
 * @Author : ITBANK
 * @Story : 은닉화에 대한 예제, 은닉화란 필드에 있는 데이터 값을 아무나 접근하지 못하게하고 getter와 setter를 통해 권한( 퍼미션 )을 획득한 개체만 데이터에 접근하도록하는 개념이다.
 */
/*
 * 접근제한자 private - 보안성이 향상됨. 컴포넌트의 독립성이 보장됨 - 컴퍼넌트간 간섭을 최소화하여 독립성을 유지할 수 있음 - 데이터 은닉
 */
public class AverageVOStep3
{
	private String	name;
	private int		kor;
	private int		eng;
	private int		tot;	// 필드에 있는 인스턴스 변수
	private double	avg;

	// 메소드들이 공유하는 데이터 값이 있는 필드 영역에
	// 접근해서 필요한 기능을 하도록 한 것은 좋은데,
	// 보안에 취약해지는 문제가 발생한다.
	// 즉 , 필드에 있는 값들은 누구나 접근해서 읽기와 쓰기( 데이터 수정 )이 가능하고
	// 따라서 접근을 할 수 없게 해야한다,
	// readOnly라는 기능은 호크의 국어 점수를 헐크가 접근하여 바꿀 수 있는 것이 Step2의 문제
	// 따라서 기능을 다시 분리해 읽기와 쓰기 기능으로 나눈다,
	// 이때 읽기를 get~( )이라고 하고 쓰기를 set~()이라고 한다. ==> !!! 아주 중요 : 은닉과( 캡슐화 ) 이다.
	// 이클립스에서는 필드값에 대한 메소드에 이름을 주는 것을 자동화 했다.
	// getter(읽기가능) 과 setter(쓰기가능)의 메소드를 자동으로 생성해 준다.
	// 단축기는 ALT + SHIFT + S 에서
	// generate getter and setter을 선택하면 된다.
	public String getName( )
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public int getKor( )
	{
		return kor;
	}

	public void setKor( int kor )
	{
		this.kor = kor;
	}

	public int getEng( )
	{
		return eng;
	}

	public void setEng( int eng )
	{
		this.eng = eng;
	}

	public int getTot( )
	{
		return tot;
	}

	public void setTot( int kor, int eng )
	{
		this.tot = kor + eng;

		// 자동으로 이클립스를 통해서 메소드명 리턴타입, 파라미터를 생성시킨 후,
		// 각각의 필요에 따라 약간씩만 수정하는 미세조정을 통해
		// 코딩을 완성하면 된다.

	}

	public double getAvg( )
	{
		return avg;
	}

	public void setAvg( double avg )
	{
		this.avg = tot / 2; // 위에 있는 double avg를 뜻함( this.avg )는
	}

}
// 지역변수는 공유 기능이 없음
// 그래서 main mathod에서는 this를 쓸수 없다.
