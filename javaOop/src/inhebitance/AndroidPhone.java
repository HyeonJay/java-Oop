package inhebitance;

public class AndroidPhone extends Iphone {
	public static final String	BRAND	= "�ȵ���̵�";
	private String				data;

	/*
	 * public String getData( ) { return data; }
	 */

	/*
	 * public void setData( String name, String msg ) { super.setCompany(BRAND); super.setPortable(TRUE); super.setCall(name); this.data =
	 * super.getCompany() + "\t" + super.getCall() + "\t" + msg + " : �޽��� ����"; }
	 */

	@Override
	public void setData( String name, String msg ) {
		super.setCompany(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		this.data = super.getCompany() + "\t" + super.getCall() + "\t" + msg + " : īī���� �޽��� ����";

	}

	@Override
	public String getData( ) {
		return super.getData();
	}

}
