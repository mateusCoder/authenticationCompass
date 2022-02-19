import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AuthenticationApplication {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		String user;
		String key;
		int tryLogin = 0;
		
		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH");
		String hourNow = formatterHora.format(LocalDateTime.now());
		int hourNowInt = Integer.parseInt(hourNow);
	
		User account = new User("fernanda", "0123");
		User account2 = new User("mateus", "54321");
		User account3 = new User("xablau", "54321");
		
		while(tryLogin < 3) {
			System.out.println("usuário: ");
			user = read.next();
			System.out.println("senha: ");
			key = read.next();
			
			if(account.autenthicationUser(user, key)) {
				account.verifyHour(hourNowInt);
				tryLogin = 3;
			}else {
				System.out.println("\n" + "Usuário e/ou senha incorretos.\n");
				if(tryLogin < 2) {
					System.out.println("Tente Novamente! \n");
				}else {
					System.out.println("Tentativas Expiradas.");
				}
				tryLogin++;
			}
		}	
	}

}
