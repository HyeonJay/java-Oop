package hashMap;

public interface MemberService {

	// ȸ������ ��� : �Ķ���� �߰��� ������ ����
	public void join( String ID, String Password, String name, String addr, int age );

	// �α��� ��� : �Ķ���� �߰��� ������ ����
	public String login( String ID, String Password );

}
