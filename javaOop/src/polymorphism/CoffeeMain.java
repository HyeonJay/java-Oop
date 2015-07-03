package polymorphism;
//@Date : 2015. 6. 19
//@Author : ITBANK
//@Story : 커피 객체 클래스를 통해 생성자 
//★★★★★오버로딩을 이해해보는 실행 클래스
public class CoffeeMain {
	public static void main( String[] args ) {
     CoffeeVO coffee = new CoffeeVO();
     //파라미터가 없는 생성자를 통한 객체 생성
     System.out.println(coffee.getMsg());
	}
}
