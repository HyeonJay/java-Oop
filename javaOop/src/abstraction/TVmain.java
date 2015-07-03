package abstraction;

public class TVmain {
	public static void main( String[] args ) {

		TV samsumgTV = new TV();
		samsumgTV.setInfo("삼성", "와이드TV", "123-456", "42인치", "LCD");
		samsumgTV.getInfo();
	}
}
