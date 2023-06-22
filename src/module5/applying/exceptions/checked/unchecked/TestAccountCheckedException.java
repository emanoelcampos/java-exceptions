package module5.applying.exceptions.checked.unchecked;

public class TestAccountCheckedException {

    public static void main(String[] args) {

        Account account = new Account();
        try{
            account.depositFounds();
        } catch(MyException exception){
            System.out.println("handling exception");
        }

    }
}
