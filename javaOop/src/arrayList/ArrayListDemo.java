package arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListDemo {
	public static void main( String[ ] args ) {
		// ArrayList�� �������̽� List�� ������ Ŭ�����Դϴ�.
		// ���� ArrayList ��ü ������ InterfaceŸ������ 
		// �Ѵٴ� ��Ģ�� ����
		List< String > list = new ArrayList< String >( );

		list.add( "ȫ�浿" );
		list.add( "������" );
		list.add( "�̼���" );
		list.add( "������" );
		list.add( "ȫ�浿" );
		System.out.println( "����Ʈ ��� ���� : " + list.size( ) );
		// �Է°� ������ ���Ϳ� ���������� 
		// ����� �� �ٸ��ϴ�. �����Ͻÿ�.
		// GoF( Gang of Four )�ڹ� ������ ���� 23���� ��
		// �� ������ Iterator �������� ����Ѵ�.

		Iterator it = list.iterator( );
		while ( it.hasNext( ) ) {
			Object object = ( Object ) it.next( );
			System.out.print( object + "\t" );
			// ArrayList�� �ߺ��� ����մϴ�.
		}
		System.out.println( );
		//Set �������̽� Ÿ������ HashSet ��ü�� ������
		//Set<Object> group = new HashSet<Object>( ); // ���� Ÿ�� 
		//������ Ÿ���� �˸� �� Ÿ���� ���ִ°� ���� ����. Object�� �����̶��  Object��� ��������
		Set< String > list2 = new HashSet< String >( ); //  �ߺ� ��� ���� => ID������ �ڵ��ϴµ� ����ϸ� ����.
		list2.add( "ȫ�浿" );
		list2.add( "������" );
		list2.add( "�̼���" );
		list2.add( "������" );
		list2.add( "ȫ�浿" );
		Iterator it2 = list2.iterator( );

		while ( it2.hasNext( ) ) {
			Object object = ( Object ) it2.next( );
			System.out.print( object + "\t" );
		}
		System.out.println( );
		list.addAll( list2 ); //��ġ�°�  list���ٰ�  list2�� ���ϴ°�

		Iterator it3 = list.iterator( );
		while ( it3.hasNext( ) ) {
			Object object = ( Object ) it3.next( );
			System.out.print( object + "\t" );
		}
	}
}
