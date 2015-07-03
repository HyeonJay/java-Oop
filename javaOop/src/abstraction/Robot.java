package abstraction;

public interface Robot {
	public int attack( );

	public void shield( int attack );

	public void run( );

	public void status( );

	public void chargeEnergy( int energy );
}
