package arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListDemo {
	public static void main( String[ ] args ) {
		// ArrayList는 인터페이스 List를 구현한 클래스입니다.
		// 따라서 ArrayList 객체 생성은 Interface타입으로 
		// 한다는 규칙에 따라
		List< String > list = new ArrayList< String >( );

		list.add( "홍길동" );
		list.add( "강감찬" );
		list.add( "이순신" );
		list.add( "김유신" );
		list.add( "홍길동" );
		System.out.println( "리스트 목록 갯수 : " + list.size( ) );
		// 입력과 갯수는 벡터와 동일하지만 
		// 출력은 좀 다릅니다. 주의하시오.
		// GoF( Gang of Four )자바 디자인 패턴 23가지 중
		// 한 가지인 Iterator 패턴으로 출력한다.

		Iterator it = list.iterator( );
		while ( it.hasNext( ) ) {
			Object object = ( Object ) it.next( );
			System.out.print( object + "\t" );
			// ArrayList는 중복을 허용합니다.
		}
		System.out.println( );
		//Set 인터페이스 타입으로 HashSet 객체를 생성함
		//Set<Object> group = new HashSet<Object>( ); // 만능 타입 
		//하지만 타입을 알면 그 타입을 써주는게 더욱 좋다. Object가 만능이라고  Object라고만 쓰지말고
		Set< String > list2 = new HashSet< String >( ); //  중복 허용 안함 => ID같은데 코딩하는데 사용하면 좋다.
		list2.add( "홍길동" );
		list2.add( "강감찬" );
		list2.add( "이순신" );
		list2.add( "김유신" );
		list2.add( "홍길동" );
		Iterator it2 = list2.iterator( );

		while ( it2.hasNext( ) ) {
			Object object = ( Object ) it2.next( );
			System.out.print( object + "\t" );
		}
		System.out.println( );
		list.addAll( list2 ); //합치는거  list에다가  list2를 더하는거

		Iterator it3 = list.iterator( );
		while ( it3.hasNext( ) ) {
			Object object = ( Object ) it3.next( );
			System.out.print( object + "\t" );
		}
	}
}
