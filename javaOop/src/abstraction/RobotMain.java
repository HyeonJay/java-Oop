package abstraction;

public class RobotMain {
	public static void main( String[] args ) {
		//������ ���� : ���ڷ��̼� ����
		//���ڷ��̼� ����( ����ũ ���� �� ��Ʋ���ٰ� ��� ) ( ��ũ�� ) ��� ���� )

		BasicBot myBot = new BasicBot(); // 1. ��Ʋ �غ�
		GunBot myGun = new GunBot(myBot);
		ShieldBot myShield = new ShieldBot(myBot);

		myGun.status();
		myGun.chargeEnergy(50);
		
		myGun.status();
		
		myShield.chargeEnergy(10);
		myShield.status();
	}
}
