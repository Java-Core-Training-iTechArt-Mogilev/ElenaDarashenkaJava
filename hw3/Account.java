import java.util.Arrays;
import java.util.List;

public class Account {

    public int accountId;
    BillBYN billBYN = new BillBYN();
    BillRUB billRUB = new BillRUB();
    BillUSD billUSD = new BillUSD();

    List<Bill> bills = Arrays.asList(billBYN, billRUB, billUSD);

    public Account(int accountId) {
        this.accountId = accountId;
    }

    public int getAccountId() {
        System.out.println("Your id: " + accountId);
        return accountId;
    }
}
