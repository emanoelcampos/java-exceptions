package module5.applying.exceptions.bytebank;

public class TestWithdraw {

    public static void main(String[] args) {

        Account account = new CurrentAccount(13, 7713);
        account.depositFunds(200.0);
        try {
            account.withdrawFunds(250.0);
        } catch (InsufficientFundsException exception) {
            System.out.println(exception.getMessage());
        }


        System.out.println(account.getBalance());

    }
}
