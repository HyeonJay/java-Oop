package hashMap;

import java.util.Scanner;

public class MemberMain {
	public static void main( String[ ] args ) {
		Scanner scanner = new Scanner( System.in );

		System.out.println( "���̵� �Է��ϼ���" );
		String id = scanner.next( );

		System.out.println( "��й�ȣ�� �Է��ϼ���" );
		String password = scanner.next( );

		System.out.println( "�̸��� �Է��ϼ���" );
		String name = scanner.next( );

		System.out.println( "���̸� �Է��ϼ���" );
		int age = scanner.nextInt( );

		System.out.println( "�ּҸ� �Է��ϼ���" );
		String addr = scanner.next( );

		//��ü�� �����ؼ� �ϼ���Ű����
		// ��ü�� �������ϴ� ������ �� �Ѱ���
		// ��ü�� �ҷ����� �޼ҵ带 Ȱ���ϱ� ���ؼ�
		MemberService memberServiceImpl = new MemberServiceImpl( );

		memberServiceImpl.join( id, password, name, addr, age );

		while ( true ) { // ���� ���� ������ if ���ǿ���  break�� �ʼ��� �����ؾ��Ѵ�.
			System.out.println( "�α����� �ϼ���" );
			System.out.println( "���̵� �Է����ּ���" );
			String LoginID = scanner.next( );

			System.out.println( "��й�ȣ�� �Է����ּ���" );
			String LoginPASS = scanner.next( );
			String msg = memberServiceImpl.login( LoginID, LoginPASS );
			String flag = msg.substring( 0, 5 ); // ȯ���մϴٶ����� ��

			if ( flag.equals( "ȯ���մϴ�" ) ) {
				System.out.println( msg );
				break;
			}
			else if ( flag.equals( "��й�ȣ��" ) ) {
				System.out.println( msg );
				continue; //���� �������� ��� ���ƶ�. break�� �ݴ밳�� 
			}
			else if ( flag.equals( "�Է��Ͻ� " ) ) {
				System.out.println( msg );
				continue;
			}
			else {
				System.out.println( "�ٽ� �Է��� �ּ���." );
			}
		}

	}
}
