import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AuthenticationApplication {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		String user;
		String key;
		
		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH");
		String hourNow = formatterHora.format(LocalDateTime.now());
		int hourNowInt = Integer.parseInt(hourNow);
	
		User account = new User("fernanda", "0123");
		User account2 = new User("mateus", "54321");
		User account3 = new User("xablau", "54321");
				
		System.out.println("usuário: ");
		user = read.next();
		System.out.println("senha: ");
		key = read.next();
		
		if(account.autenthicationUser(user, key)) {
			if(hourNowInt >= 0 && hourNowInt < 6) {
				System.out.println("Boa madrugada, você se logou ao nosso sistema.");
			}else if(hourNowInt >= 6 && hourNowInt < 12) {
				System.out.println("Bom dia, você se logou ao nosso sistema.");
			}else if(hourNowInt >= 12 && hourNowInt < 18) {
				System.out.println("Boa tarde, você se logou ao nosso sistema.");
			}else if(hourNowInt >= 18 && hourNowInt < 24) {
				System.out.println("Boa tarde, você se logou ao nosso sistema.");
			}
		}else {
			System.out.println("Usuário e/ou senha incorretos.");
		}
	}

}
