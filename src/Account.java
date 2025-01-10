public class Account {
//    (representerar konton)
    private String accountNumber;
//    Lönekonto eller Sparkonto
    private String accountType;
    private int saldo;

    public Account(int saldo, String accountType){
        this.saldo = saldo;
        this.accountType = accountType;
//        Tagen ifrån stackoverflow.
        this.accountNumber ="Account: " + (int)(Math.random() * 10000);
    }

//    Till att komma ihåg, intellij har 'generate', mycket andvändbart.
    public String getAccountNumber() {
        return accountNumber;
    }



    public String getAccountType() {
        return accountType;
    }

    public int getSaldo() {
        return saldo;
    }


}
