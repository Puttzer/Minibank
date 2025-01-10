public class Account {
//    (representerar konton)
    private String accountNumber;
    private String name;
//    Lönekonto eller Sparkonto
    private String accountType;
    private int saldo;

    public Account(String name, int saldo, String accountType){
        this.name = name;
        this.saldo = saldo;
        this.accountType = accountType;
//        Tagen ifrån stackoverflow.
        this.accountNumber ="Account: " + (int)(Math.random() * 10000);
    }

//    Till att komma ihåg, intellij har 'generate', mycket andvändbart.
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getSaldo() {
        return saldo;
    }


}
