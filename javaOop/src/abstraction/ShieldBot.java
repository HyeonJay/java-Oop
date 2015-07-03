package abstraction;

public class ShieldBot extends BasicBot {
	Robot	robot;

	public ShieldBot(Robot robot ) {
		this.robot = robot;
	}
	
	@Override
	public int attack( ) {
		return robot.attack();
	}

	@Override
	public void shield( int attack ) {
		robot.shield((int) (attack*0.2));
	}

	@Override
	public void run( ) {
		robot.run();
		speed -= 5;
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
