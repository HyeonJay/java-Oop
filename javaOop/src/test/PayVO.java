package test;

public class PayVO
{
	//필드에 선언된 인스턴스 변수는 반드시 접근제한자들 중 private으로 선언하여
	//은닉화를 만들어야 한다.
	//그렇지 않으면 getter, setter을 할 이유가 없다.
	private String				name;		//직원이름
	private int					salary;	// 급여

	// 세율은 대한민국 국민이라면 누구나 알아야 할 정보
	//따라서, 공개되어야하는 필드값이다.
	//이런 값은 오픈이 되어야 하므로 상수로 처리하며
	//static이라는 클래스 변수 키워드를 붙여서 오픈해준다.
	//그리고 강제성은 없지만 프로그래밍에서는 이런 값들은 
	//전부 대문자로 표기해서 구분한다.

	//final 은 바꾸지 못한다.는 의미
	//setter, getter을 만들면 안됨. 
	//왜냐하면 고정값이기 때문이다.

	public static final double	Tax	= 0.1;	// 세율 10%는 고정값
	private int					income;	//실급여 = 급여 - 세액(급여 * 세율 )

	public String getName( )
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public int getSalary( )
	{
		return salary;
	}

	public void setSalary( int salary )
	{
		this.salary = salary;
	}

	public int getIncome( )
	{
		return income;
	}

	public void setIncome( int salary )
	{
		this.income = (int) (salary - (salary * Tax));
	}

}
