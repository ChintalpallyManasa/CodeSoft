import java.util.Scanner;
public class UserInterface {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        boolean f = true;
        ATM a=new ATM();
        while (f) {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                double amount= a.checkbalance();
                System.out.println("Your current balance is :"+amount);
                    break;
                case 2:
                System.out.println("Enter the amount you want to deposit");
                amount=sc.nextDouble();
                    a.deposit(amount);
                    break;
                case 3:
                System.out.println("Enter the amount you want to withdraw");
                amount=sc.nextDouble();
                    a.withdraw(amount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    f = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
