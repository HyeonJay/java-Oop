package encapsule;

/*
 * @Story : 카우푸지수를 보여주는 모듈 ( 컴포넌트 )
 * */
public class KaupVO
{
	// 메소드 = 접근제한자( public ) + 리턴( void ) + 메소드이름 + ( ) + { }
	public String getKaup(double weight, double height)
	{
		/*
		 * 아래식은 double타입의 결과물을 int 타입의 변수에 할당해야 하므로 캐스팅이 일어났으며, 보통 이클립스가 제안하는 자동 완성 방식으로 해결한다.
		 */
		int idx = (int) ((weight / (height * height)) * 10000);

		String msg = "";

		if (idx > 30)
			msg = "비만";

		else if (idx > 24 && idx <= 30)
			msg = "과체중";

		else if (idx > 20 && idx <= 24)
			msg = "정상";

		else if (idx > 15 && idx <= 20)
			msg = "저체중";

		else if (idx > 13 && idx <= 15)
			msg = "마름";

		else if (idx > 10 && idx <= 13)
			msg = "영양실조";

		else
			msg = "소모증";

		return msg;

	}
}
