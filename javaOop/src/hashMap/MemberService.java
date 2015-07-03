package hashMap;

public interface MemberService {

	// 회원가입 기능 : 파라미터 추가는 개발자 자유
	public void join( String ID, String Password, String name, String addr, int age );

	// 로그인 기능 : 파라미터 추가는 개발자 자유
	public String login( String ID, String Password );

}
