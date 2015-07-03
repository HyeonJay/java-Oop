package abstraction;

public class GunBot extends BasicBot {
	Robot	robot;

	// 디자인 패턴 : 자바 클래스를 코딩하는데 있어서 
	//                  GoF( Gang of Four ) 개발자 4명이
	//                  패턴을 발견하고 24~25 패턴으로 정리한 개념
	// - 데코레이션 패턴

	public GunBot( Robot robot ) {
		this.robot = robot;
	}

	@Override
	public int attack( ) {
		return robot.attack() * 3;
	}

	@Override
	public void shield( int attack ) {
		robot.shield(attack);

	}

	@Override
	public void run( ) {
		speed += 20;

	}

	@Override
	public void status( ) {
		super.status();
	}

	@Override
	public void chargeEnergy( int energy ) {
		super.chargeEnergy(energy);

	}
}
