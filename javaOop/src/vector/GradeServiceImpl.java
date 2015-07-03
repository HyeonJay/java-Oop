package vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {

	private Vector<Grade >	grades	= new Vector<Grade >( );
	private Grade			grade;

	// �Ķ���� Ÿ���� ��ü ��ü�̹Ƿ�, ������ ����, ���� �̷� ������ �ڵ鸵 �� �ʿ䰡 ����.
	@Override
	public void input( Grade grade ) {
		// grades.addElement(grade);
		grades.addElement( grade );
		// �� �߿� �ϳ� �ϸ� �ȴ�.
	}

	@Override
	public void printList( ) {
		//���� ���ο� toString�� ȣ���ϸ�  ���( element )���ο� ���ǵ� toString( )�� ���� ȣ���� �ش�.
		System.out.println( grades.toString( ) );
	}

	@Override
	public String searchGradeByHak( String hak ) {
		System.out.println( "�Էµ� �й� : " + hak );
		String msg = "";
		String searchdHak = "", name = ""; // �˻��Ϸ��� �й�
		int kor = 0, eng = 0, math = 0;
		for ( int i = 0; i < grades.size( ); i++ ) {
			searchdHak = grades.elementAt( i ).getHak( );

			if ( hak.equalsIgnoreCase( searchdHak ) ) {
				name = grades.elementAt( i ).getName( );
				kor = grades.elementAt( i ).getKor( );
				eng = grades.elementAt( i ).getEng( );
				math = grades.elementAt( i ).getMath( );
				// ��ü�� �̷�� �ʵ� ���� �� �˾Ƴ� ���� ...
				grade = new Grade( searchdHak, name, kor, eng, math );
				msg = grade.toString( );
			}
			else {
				msg = "�˻��Ϸ��� �й��� �����ϴ�.";
			}
		}
		return msg;
	}

	@Override
	public Vector<Grade > searchGradesByName( String name ) {

		// �ڵ�����
		// 1. �������̽��� ������ ������ �������̽��̸� +Impl Ŭ���� ����
		// 2. �� Ŭ������ �������̽��� ������ implements ��
		// 3. �޼ҵ尡 ����� ���� ��� Ʋ(���� ) �ڷᱸ���� �ʵ忡 ����
		//   -�ڷᱸ���� ����ÿ��� �ڷᱸ�� ���ο� �ִ� ��ü ������ ���Ҿ� ����
		// 4. �޼ҵ� ���ο� ����Ÿ���� ������ �����ϰ� �ʱ�ȭ�� �� ���� ���� ��ġ
		//     -�ڷᱸ���� ����ÿ��� �ڷᱸ�� ���ο� �ִ� ��ü ������ ���Ҿ� ����
		// 5. �˰����� �ʿ��� ��Ȳ���� �� ��°��� �˻������� for+if �� ��ġ
		Vector<Grade > temp = new Vector<Grade >( );
		Grade grade = new Grade( );

		for ( int i = 0; i < grades.size( ); i++ ) {
			String searchedName = grades.elementAt( i ).getName( );
			if ( name.equalsIgnoreCase( searchedName ) ) {
				
				temp.add( new Grade( grades.elementAt( i ).getHak( ), grades.elementAt( i ).getName( ), grades.elementAt( i ).getKor( ), grades
							.elementAt( i ).getEng( ), grades.elementAt( i ).getMath( ) ) );

			}
			else {
				// �� ���ٰ� 3��° ���� ���� �ǹ��̴�.
				Grade g = new Grade( );
				temp.remove( g );
				//temp.remove(new Grade());
			}
		}
		return null;
	}

}
