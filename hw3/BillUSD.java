import java.util.Scanner;

public class BillUSD extends Bill {

    Scanner scanner = new Scanner(System.in);
    String currency = "USD";
    int sum = 800;

    public void checkBalance() {
        if (sum > 0) {
            System.out.println("Your balance (USD bill): " + sum + " " + currency);
        }
        if (sum <= 0) {
            System.out.println("You have no money... Sorry!");
        }
    }

    public void getMoney() {
        System.out.println("Input sum you want to get: ");
        int moneyToGet = scanner.nextInt();
        if (moneyToGet < sum) {
            System.out.println("You get " + moneyToGet + " " + currency);
            sum = sum - moneyToGet;
        }
        if (moneyToGet > sum) {
            System.out.println("You get " + sum + " " + currency);
            sum = 0;
        }
    }

    public void putMoney() {
        System.out.println("Input sum you want to put: ");
        int moneyToPut = scanner.nextInt();
        System.out.println("You put " + moneyToPut + " " + currency);
        sum = sum + moneyToPut;
    }
}


