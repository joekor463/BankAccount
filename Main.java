public class Main {
    public static void main(String arg[]) {

        BankAccount bankAccount = new BankAccount ();

        bankAccount.setAccountNumber(1234456);
        bankAccount.setBalance ( 0 );
        bankAccount.setCustomerName ( "Ivan Ivanych Ivanov" );
        bankAccount.setEmail ( "ivan@mail.ru" );
        bankAccount.setPhone ( "9146754365" );
        bankAccount.depositFunds ( 4000 );
        bankAccount.withdrawFunds ( 3000 );


    }
}
