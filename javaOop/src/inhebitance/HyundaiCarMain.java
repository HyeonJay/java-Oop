package inhebitance;

public class HyundaiCarMain {
	public static void main( String[] args ) {

		HyundaiCar sonata = new HyundaiCar();
		sonata.setCompanyName("현대");
		sonata.setBrand("소나타");
		System.out.println(sonata.getCompanyName() + "\t" + sonata.getBrand() + "\t" + Car.CAR);
	}
}
