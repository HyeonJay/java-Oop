package inhebitance;

// @Date : 2015. 6. 22
// @Author : ITBANK;
// @Story : Car ������ ���� ����� �ǹ�
// - Ű���� extends�� ����ϸ�
// - �� Ŭ���� ���̿� �θ� �ڽİ��谡 �����Ѵ�.
// - ��� ���谡 �����Ǹ� �ڽ� Ŭ������
// - �θ� Ŭ������ ��� �ν��Ͻ� ������ �޼ҵ带 ��밡���ϰ� �Ѵ�.
// - �ٸ� �θ�Ŭ������ �ν��Ͻ� ������ private �̸�
// - getter/setter�� ����ϴµ� �� �� �θ��� �޼ҵ��
// - super��� Ű���带 ���� �����´�
public class HyundaiCar extends Car {
	private String	brand;

	public String getBrand( ) {
		return brand;
	}

	public void setBrand( String brand ) {
		this.brand = brand;
	}
	
}