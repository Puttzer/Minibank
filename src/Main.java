
import java.util.Scanner;
public class Main {
    //        (innehåller huvudmetoden för programmet)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User loggedInUser = null;

        while (true) {
            if (loggedInUser == null) {
                System.out.println("1. Skapa användare");
                System.out.println("2. Logga in");
                System.out.println("3. Avsluta");
                int choice = scanner.nextInt();

//                Basic switch-case, multiple choice options, need to add if user input not allowed value it closes with error.
//                Now it just repeats itself. Not very good validation.
                switch (choice) {
                    case 1:
                        System.out.println("Ange personnummer:");
                        String personnummer = scanner.next();
                        System.out.println("Ange PIN (4 siffror):");
                        String pin = scanner.next();
                        Bank.createUser(personnummer, pin);
                        break;
                    case 2:
                        System.out.println("Ange personnummer:");
                        String loginPersonnummer = scanner.next();
                        System.out.println("Ange PIN:");
                        String loginPin = scanner.next();
                        loggedInUser = Bank.login(loginPersonnummer, loginPin);
                        break;
                    case 3:
                        System.out.println("Avslutar programmet...");
                        System.exit(0);
                }
            } else {
                System.out.println("1. Visa mina konton");
                System.out.println("2. Logga ut");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        loggedInUser.listAccounts();
                        break;
                    case 2:
                        loggedInUser = null;
                        break;
                }
            }
        }
    }
}
