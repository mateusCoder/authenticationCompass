
public class User{
	private String user;
	private String key;
	
//	public String getUser() {
//		return this.user;
//	}
	
	public boolean autenthicationUser(String user, String key) {
		if(user.equals("mateus") && key.equals("12345")){
			return true;
		}
		return false;
	}
}




