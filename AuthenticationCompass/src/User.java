import java.util.ArrayList;

public class User{
	private static ArrayList<String> users = new ArrayList<>();
	private static ArrayList<String> keys = new ArrayList<>();
	
	public User(String users, String keys) {
		this.users.add(users);
		this.keys.add(keys);
	}

	public boolean autenthicationUser(String user, String key) {	
		for(int i = 0; i < users.size(); i++) {
			if(user.equals(users.get(i)) && key.equals(keys.get(i))){
				return true;
			}
		}
		return false;
	}
	
}




