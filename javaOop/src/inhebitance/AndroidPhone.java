package inhebitance;

public class AndroidPhone extends Iphone {
	public static final String	BRAND	= "안드로이드";
	private String				data;

	/*
	 * public String getData( ) { return data; }
	 */

	/*
	 * public void setData( String name, String msg ) { super.setCompany(BRAND); super.setPortable(TRUE); super.setCall(name); this.data =
	 * super.getCompany() + "\t" + super.getCall() + "\t" + msg + " : 메시지 전달"; }
	 */

	@Override
	public void setData( String name, String msg ) {
		super.setCompany(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		this.data = super.getCompany() + "\t" + super.getCall() + "\t" + msg + " : 카카오톡 메시지 전달";

	}

	@Override
	public String getData( ) {
		return super.getData();
	}

}
