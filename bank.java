public class bank {
    
        String HolderName;
        int AccountNumber;
        double Balance;
        
        bank(String HolderName, int AccountNumber, double Balance){
            this.HolderName = HolderName;
            this.AccountNumber = AccountNumber;
            this.Balance = Balance;
        }
void displayDetails(){
            System.out.println("Account Holder Name: " + HolderName);
            System.out.println("Account Number: " + AccountNumber);
            System.out.println("Account Balance: " + Balance);
        }
        void withdraw(double amount){
            if(amount <= Balance){
                Balance -= amount;
                System.out.println("Withdrawal of " + amount + " successful. New balance: " + Balance);
            } else {
                System.out.println("Insufficient balance. Withdrawal failed.");
            }
        }
        void deposit(double amount){
            Balance += amount;
            System.out.println("Deposit of " + amount + " successful. New balance: " + Balance);
        }
        public static void main(String[] args) {
            bank b1  = new bank("shri", 123456, 1000.0);
            b1.displayDetails();
            b1.deposit(500.0);
            b1.withdraw(200.0);
            b1.withdraw(1500.0);
        }
      
    }