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
	
	public void verifyHour(int hour) {
		if(hour >= 0 && hour < 6) {
			System.out.println("Boa madrugada, você se logou ao nosso sistema.");
		}else if(hour >= 6 && hour < 12) {
			System.out.println("Bom dia, você se logou ao nosso sistema.");
		}else if(hour >= 12 && hour < 18) {
			System.out.println("Boa tarde, você se logou ao nosso sistema.");
		}else if(hour >= 18 && hour < 24) {
			System.out.println("Boa noite, você se logou ao nosso sistema.");
		}
	}
	
}




