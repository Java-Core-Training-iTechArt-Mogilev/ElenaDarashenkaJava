public class MainClass {

    public static void main(String[] args) {

        Account account = new Account(1234);
        User user = new User();
        BillBYN billByn = new BillBYN();
        BillRUB billRub = new BillRUB();
        BillUSD billUsd = new BillUSD();

        user.SayHelloToUser();
        account.getAccountId();

        billByn.checkBalance();
        billByn.getMoney();
        billByn.checkBalance();
        billByn.putMoney();
        billByn.checkBalance();

        billRub.checkBalance();
        billRub.getMoney();
        billRub.checkBalance();
        billRub.putMoney();
        billRub.checkBalance();

        billUsd.checkBalance();
        billUsd.getMoney();
        billUsd.checkBalance();
        billUsd.putMoney();
        billUsd.checkBalance();
    }
}

