package encapsule;

import java.util.Scanner;

/*
 * @Date : 2015. 6. 16
 * @Author : ITBANK 구로점;
 * @ Stroy : 메인 메소드에서 모듈화 로직의 분리 예제;
 * */
public class LeapYearVO
{
	public String getLeapYear(int year)
	{
		/*
		 * 연도를 4로 나눈 값이 0 이라면 윤년일 수 있다. 그러나 해당 연수가 100으로 나누어 떨어지면 평년이다 평년이란 해도 다시 400으로 나누어지는 연도는 윤년이다
		 */
		String yearmsg = "";
	


		if (year % 400 == 0)
		{
			// 필터링 if문에서 차례대로 연산식을 거쳐 참 거짓을 판멸하면서 하부로 값을 전달하는 행위
			// 필터링 방식은 결과값을 크게 주는 범위부터 작은 방향으로 진행.
			yearmsg = "윤년";
		}
		else if (year % 100 == 0)
		{
			yearmsg = "평년";
		}
		else if (year % 4 == 0)
		{
			yearmsg = "윤년";
		}
		else
		{
			yearmsg = "평년";
		}
		return yearmsg;
	}
/*
 * 출력 값을 독립시키기 위해서는 메소드에 리턴 타입을 void가 아닌 리턴 값에 따른 데이터 타입을 주면된다.
 * */
}
