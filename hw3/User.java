public class User {

    public String userName = "Lena";
    Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    void SayHelloToUser() {
        System.out.println("Hello " + userName);
    }
}
