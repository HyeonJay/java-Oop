package syntax;

public class Overriding {
	public static void main( String[] args ) {
		Parents p = new Parents();
		p.show();

		Child c = new Child();
		c.show();
	}
}

class Parents {
	void show( ) {
		System.out.println("Parents 의 show( )를 수행 ..");
	}
}

class Child extends Parents {
	void show( ) {
		//System.out.println("Child 의 show( )를 수행 .."); //객체 지향에서 다형성을 의미
		super.show(); // 이것은 부모의 메소드를 그대로 사용하겠다는 의미
	}

}
// 객체 지향 언어 4대 특징
// 1. 은닉화 : getter / setter , 생성자, this
// 2. 다양성 : 생성자(메소드) 오버로딩, 부모 메소드 오버라이딩
// 3. 상속 : extends, super
// 4. 추상성 : interface, abstract class