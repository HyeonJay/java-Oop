package abstraction;

public class Notebook extends ProductSpec {
	private String	cpu;
	private String	ram;
	private String	hdd;

	public void setInfo( String company, String name, String seialNo, String cpu, String ram, String hdd ) {
		super.setInfo(company, name, seialNo);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;

	}
//구현
	//파라미터로 넘어온 값들도 바로 super을 통해 부모메소드의 파라미터로 던져서 바로 set한다,
	// 즉, 멤버의 공유가 부모자식 관계에서 성립하므로, 부모의 멤버에 대한 접근에서 가능해진다.
	@Override
	public void getInfo( ) {
		super.getInfo();
		System.out.println("cpu 정보 : " + this.cpu);
		System.out.println("메인메모리 정보 : " + this.ram);
		System.out.println("하드디스크 정보 : " + this.hdd);
	}
/*
 * @Story :
 * 커피 객체 클래스를 통해 생성자 아래 예처럼 하나의 클래스를 가지고 계속 반복해서 서로 다른 객체를 생성한 후
 * 여러번 기능에 따라 반복 사용하는 것을 [생성자]오버로딩이라고 한다.
 * 아래 예에서는 생성자를 여러번 반복했으므로 생성자 오버로딩이고 만약 메소드를 파라미터만 다른 형태로 여러개의 통일 이름으로 선언 하였다면
 * 이름 [메소드]오버로딩이라고 한다.*/
}
