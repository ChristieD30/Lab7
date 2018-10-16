import java.util.Scanner;


public class ValidInput {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String userName = Validator.getStringMatchingRegex(scan, "Please enter a name", "[a-zA-Z]+");

		System.out.println(userName + " is a valid name!");

		String phoneNumber = Validator.getStringMatchingRegex(scan,
				"Please enter a phone number. Example: 123-456-7890.", "\\d{3}-\\d{3}-\\d{4}");

		System.out.println(phoneNumber + " is a valid phone number!");

		String userEmail = Validator.getStringMatchingRegex(scan, "Please enter an email. Example: yourname@domain.com",
				"^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
		System.out.println(userEmail + " is a vaild email address!");

		String userDate = Validator.getStringMatchingRegex(scan, "Please enter a valid date. dd/mm/yyyy",
				("^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20|21)\\d\\d$"));
		System.out.println(userDate + " is a valid date!");

//		String htmlElements = Validator.getStringMatchingRegex(scan, "Please enter an HTML element:",
//				("<(\"[^\"]*\"|'[^']*'|[^'\">])*>"));
//		System.out.println(htmlElements);

		scan.close();
	}

}
