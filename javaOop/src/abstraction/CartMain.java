package abstraction;

public class CartMain {
	public static void main( String[] args ) {
		TV samsumgTV = new TV();
		samsumgTV.setInfo("삼성", "와이드TV", "123-456", "42인치", "LCD");
		//samsumgTV.getInfo();
		System.out.println();

		Notebook lgNotebook = new Notebook();
		lgNotebook.setInfo("LG", "그램", "123-456", "ebdjfzhdj", "8G", "500GB");
		//	lgNotebook.getInfo();
		// 생성자를 사용하지 않는 배열선언은 인터페이스 타입으로도 가능하다.

		Product cart[] = new Product[2];
		cart[0] = samsumgTV;
		cart[1] = lgNotebook;

		for (Product product : cart) {// cart는 배열
			product.getInfo();
		}
		//getInfo를 일일히 코딩할 필요가 없고 for문을 사용해주면 간단하게 해결된다.
	}
}
