public class ATM{
    private double balance;
    public ATM(){
        balance=1000.58;
    }
    public ATM(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance+=amount;
        System.out.println("Deposited successfully");
    }
    public void withdraw(double amount){
        double checkbalance=checkbalance();
        if(amount>checkbalance){
            System.out.println("Sorry your withdrawal amount is more than balance");
        }
        else{
            this.balance-=amount;
            System.out.println("withdrawal is successful");
        }
    }
    public double checkbalance(){
        return this.balance;
    }

}