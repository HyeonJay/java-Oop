package syntax;

import java.util.Scanner;

// @Story : 가비지 컬렉션 문법
public class GarbageCollection {
	// GarbageCollectiong 가비지 컬렉팅
	// - 자바 가상기계 자동으로 수행함
	// - 멤버 메소드 안에서 생성된 객체는 메소드 종료 시 전부 메모리가 회수함
	// - 멤변은 메모리 회수 과정을 따로 거치게 됨
	// - 참조를 하지 않는 메모리 수집, System.gc( )
	// - 우선 순위가 낮은 스레드로 수행
	//   일반적인 경우 모든 스레드가 종료된 후 수행
	// - gc( )를 실행하면 강제로 메모리 회수 작업을 하게되어
	// finalize( )가 호출된다. 그러나 gc( )자체는 많은 부하를 동반하므로  JVM이 실행하도록 함
	public static void main( String[] args ) {
		Scanner scanner = new Scanner(System.in);
		
		Garbage[ ] garbageCollection = new Garbage[10];
		
		//객체 생성
		for (int i = 0; i < garbageCollection.length; i++) {
			garbageCollection[i] = new Garbage(10);
		}
		//객체 메모리 해제
		for (int i = 0; i < garbageCollection.length; i++) {
			garbageCollection[i] = null; // 메모리 회수 대상이 도미
		}
		//강제로 메모리 해제
		System.gc();
	}
}

class Garbage {
	int	objNo;	//객체 번호

	public Garbage( int num ) {
		objNo = num;
		System.out.println("Garbage Class" + objNo + "이 만들어짐..");
	}

	//객체가 메모리 회수 할 시 자동으로 호출됨
	protected void finalize( ) throws Throwable {
		System.out.println("Garbage Class" + objNo + "에서 쓰이던 메모리가 회수됨");
		super.finalize();
	}
}