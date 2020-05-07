public class BankAccount {

        private int number;
        int balance;
        String customerName;
        String email;
        String phone;



        public void setAccountNumber(int num){
            number = num;
        }

        public void setBalance(int bal){
            balance = bal;
        }

        public void setCustomerName(String cusname){
            customerName = cusname;
        }

        public void setEmail(String elmail){
            email = elmail;
        }

        public void setPhone(String phoneNumber){
            phone = phoneNumber;
        }

        public int getAccountNumber(){
            if (number == 0) return 0;
            return number;
        }

        public int getBalance(){
            return balance;
        }

        public String getCustomerName(){
            if (customerName.equals("")) System.out.println ("Customer Name not set :-(");
            return customerName;
        }

        public String getEmail(){
            if (email.equals ( "" )) System.out.println ("Your email not set - ");
            return email;
        }

        public String getPhone(){
            if (phone.equals("")) System.out.println ("Your phone not set - ");;
            return phone;
        }

        public int depositFunds(int money){
            balance = balance + money;
            System.out.println ("Your Balance - " + balance);
            return balance;
        }

        public int withdrawFunds(int money){
            if (money <= balance) {
                balance = balance - money;
                System.out.println ("Your balance -"+ balance);
                return balance;
            }
            else {
                System.out.println ( "You not enough money" );
                return 0;
            }
        }

}
