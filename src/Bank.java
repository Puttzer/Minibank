import java.util.ArrayList;

public class Bank {
//    (hanterar bankens logik, t.ex. skapa användare, logga in, överföringar

//    Blockerar möjligheten att skapa instanser av Banken
    private Bank(){}

    private static ArrayList<User> users = new ArrayList<>();

//    SKAPA ANVÄNDARE

    public static void createUser(String personNum, String pin) {
        User newUser = new User(personNum, pin);

        newUser.addAccount(new Account(0, "Lön"));
        newUser.addAccount(new Account(0, "Spar"));

        users.add(newUser);
        System.out.println("New account created with personnummer: " + personNum);
    }

//    INLOGGNING.
    /*
     Loggar in en användare genom att kontrollera personnummer och PIN.
     Personnumret för användaren som försöker logga in.
     PIN-koden för autentisering.
     User-objektet om inloggning lyckas, annars null.
     */
//    Improve comment later, stress is getting to you Pat.

    public static User login(String personNum, String pin) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getPersonNum().equals(personNum) && user.validatePin(pin)) {
                System.out.println("Login successful");
                return user;
            }
        }
        System.out.println("Incorrect login.");
        return null;
    }
}
