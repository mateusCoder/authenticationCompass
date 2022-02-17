import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AuthenticationApplication {
	public static void main(String[] args) {
		String user;
		String key;
		Scanner read = new Scanner(System.in);
		
		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH");
		String hourNow = formatterHora.format(LocalDateTime.now());
		int hourNowInt = Integer.parseInt(hourNow);
	
		User account = new User();
		
		System.out.println("usu�rio: ");
		user = read.next();
		System.out.println("senha: ");
		key = read.next();
				
		System.out.println();
		
		if(account.autenthicationUser(user, key)) {
			if(hourNowInt > 0 && hourNowInt < 6) {
				System.out.println("Boa madrugada, voc� se logou ao nosso sistema.");
			}else if(hourNowInt >= 6 && hourNowInt < 12) {
				System.out.println("Bom dia, voc� se logou ao nosso sistema.");
			}else if(hourNowInt >= 12 && hourNowInt < 18) {
				System.out.println("Boa tarde, voc� se logou ao nosso sistema.");
			}else if(hourNowInt >= 18 && hourNowInt < 24) {
				System.out.println("Boa tarde, voc� se logou ao nosso sistema.");
			}
		}else {
			System.out.println("Usu�rio e/ou senha incorretos.");
		}
	}

}
