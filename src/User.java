import java.util.ArrayList;

public class User {
//     (representerar användare)
 private String personNum;
//
 private String pin;
 private ArrayList<Account> Accounts = new ArrayList<>();  // Direkt initialisering


    public User(String personNum, String pin){
     this.personNum = personNum;
     this.pin=pin;
    }

    public String getPersonNum() {
        return personNum;
    }

//    VAliderar Pin!
    public boolean validatePin(String pin){
        return this.pin.equals(pin);
    }

//    Jag väljer att göra den här void för att den inte ska returnera någonting utan bara köra min kod.
    public void addAccount(Account account){
        Accounts.add(account);
    }

//    Printar ut konto och dess saldo.
    public void listAccounts(){
        for (int i = 0; i < Accounts.size(); i++) {
            Account konto = Accounts.get(i);
            System.out.println(konto.getAccountType() + " - Kontonummer: " + konto.getAccountNumber() + ", Saldo: " + konto.getSaldo());
        }
    }


    public ArrayList<Account> getKonton() {
        return Accounts;
    }
}
