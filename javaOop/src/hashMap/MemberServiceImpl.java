package hashMap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService {

	Member					member	= new Member( );
	Map< String , Object >	map		= new HashMap< String , Object >( );

	@Override
	public void join( String ID, String Password, String name, String addr, int age ) {
		member.setAddr( addr );
		member.setAge( String.valueOf( age ) ); // int형을 string으로 변환해서 반환
		member.setId( ID );
		member.setName( name );
		member.setPassword( Password );

		map.put( "이름", member.getName( ) );
		map.put( "주소", member.getAddr( ) );
		map.put( "ID", member.getId( ) );
		map.put( "비밀번호", member.getPassword( ) );
		map.put( "나이", member.getAge( ) );

	}

	@Override
	public String login( String ID, String Password ) {
		String SearchID = "", msg = "", Searchpassword = "";

		//	if ( SearchID.equalsIgnoreCase( ( String ) map.get( "ID" ) ) && Searchpassword.equalsIgnoreCase( ( String ) map.get( "비밀번호" ) ) ) {
		//	msg = "로그인이 되었습니다.";

		//	}
		//	else if ( SearchID.equalsIgnoreCase( ( String ) map.get( "ID" ) ) || Searchpassword.equalsIgnoreCase( ( String ) map.get( "비밀번호" ) ) ) {
		//		if ( SearchID.equalsIgnoreCase( ( String ) map.get( "ID" ) ) ) {
		//			msg = "비밀번호가 틀렸습니다.";
		//		}
		//		else {
		//			msg = "아이디가 틀렸습니다";
		///		}
		//	}
		//	else { // 아이디 비번 모두 틀림
		///		msg = "아이디와 비밀번호 둘다 틀림";
		//	}
		//	return msg;
		//	}

		if ( map.get( "ID" ).equals( ID ) && map.get( "비밀번호" ).equals( Password ) ) {
			msg = "환영합니다." + member.getAddr( ) + "에 사시는 " + member.getAge( ) + "세 되시는" + member.getName( ) + "님";
		}
		else if ( map.get( "ID" ).equals( ID ) && !map.get( "비밀번호" ).equals( Password ) ) { // 아이디는 맞는데 비밀번호는 틀린 경우
			msg = "비밀번호가 다릅니다. 다시 입력하세요";
		}

		else {
			msg = "입력하신 ID는 존재하지 않거나, 일치하지 않습니다. 다시 입력해주세요";
		}
		return msg;
	}
}
