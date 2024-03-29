package syntax;

// @Story : 컬렉션 프레임 워크
public class Collection {

	//컬렉션 프레임 워크( Collection ) 다수의 데이터를 쉽게 처리할 수 있는 표준화된 방법을 제공하는 클래스를
	// - 3가지 타입으로 기능을 요약하고 3개의 인터페이스 List, set, Map으로 나누어 구현함. 
	// - 후에 List와 Set의 공통 부분을 뽑아서 새로운 인터페이스인 Collection을 정의함

	// 요소( element ) 라고 불리는 객체들의 집합 
	//- 객체들의 컨테이너 
	// - 요소들의 개수에 따라 동적으로 크기( size )가 변한다. 
	// - 다양한 객체들의 삽입, 삭제, 검색 등을 위한 관리가 편하다.

	// 인터페이스 종류
	//-List : 순서있음, 데이터 중복 이용, 구현 클래스 : ArrayList, LinkedList, Stack, Vector 
	//-Set : 순서없음, 중복 불가, 구현 클래스 : HashSet, TreeSet 등
	// - Map : 키값은 중복 불가, 벨류는 중복 가능 : HashMap

	// Iterator iterator() : while( ) 문과 함께 쓰이면서 요소를 출력하는 기능 한가지에 특화됨 
	// Set entrySet( ) // JavaScript 에서 JSON과 같은 기능, Map에서 key + value형태로 변환 Set
	// keySet( ) // Map에 저장된 모든 key값 변환 
	// Collection values( ) // Map에 저장된 모든 value 변환

}
