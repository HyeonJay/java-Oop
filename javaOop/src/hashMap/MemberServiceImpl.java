package hashMap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService {

	Member					member	= new Member( );
	Map< String , Object >	map		= new HashMap< String , Object >( );

	@Override
	public void join( String ID, String Password, String name, String addr, int age ) {
		member.setAddr( addr );
		member.setAge( String.valueOf( age ) ); // int���� string���� ��ȯ�ؼ� ��ȯ
		member.setId( ID );
		member.setName( name );
		member.setPassword( Password );

		map.put( "�̸�", member.getName( ) );
		map.put( "�ּ�", member.getAddr( ) );
		map.put( "ID", member.getId( ) );
		map.put( "��й�ȣ", member.getPassword( ) );
		map.put( "����", member.getAge( ) );

	}

	@Override
	public String login( String ID, String Password ) {
		String SearchID = "", msg = "", Searchpassword = "";

		//	if ( SearchID.equalsIgnoreCase( ( String ) map.get( "ID" ) ) && Searchpassword.equalsIgnoreCase( ( String ) map.get( "��й�ȣ" ) ) ) {
		//	msg = "�α����� �Ǿ����ϴ�.";

		//	}
		//	else if ( SearchID.equalsIgnoreCase( ( String ) map.get( "ID" ) ) || Searchpassword.equalsIgnoreCase( ( String ) map.get( "��й�ȣ" ) ) ) {
		//		if ( SearchID.equalsIgnoreCase( ( String ) map.get( "ID" ) ) ) {
		//			msg = "��й�ȣ�� Ʋ�Ƚ��ϴ�.";
		//		}
		//		else {
		//			msg = "���̵� Ʋ�Ƚ��ϴ�";
		///		}
		//	}
		//	else { // ���̵� ��� ��� Ʋ��
		///		msg = "���̵�� ��й�ȣ �Ѵ� Ʋ��";
		//	}
		//	return msg;
		//	}

		if ( map.get( "ID" ).equals( ID ) && map.get( "��й�ȣ" ).equals( Password ) ) {
			msg = "ȯ���մϴ�." + member.getAddr( ) + "�� ��ô� " + member.getAge( ) + "�� �ǽô�" + member.getName( ) + "��";
		}
		else if ( map.get( "ID" ).equals( ID ) && !map.get( "��й�ȣ" ).equals( Password ) ) { // ���̵�� �´µ� ��й�ȣ�� Ʋ�� ���
			msg = "��й�ȣ�� �ٸ��ϴ�. �ٽ� �Է��ϼ���";
		}

		else {
			msg = "�Է��Ͻ� ID�� �������� �ʰų�, ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���";
		}
		return msg;
	}
}
