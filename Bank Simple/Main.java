package 'folder'.'subfolder';
import 'folder.'subfolder'.bank;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        int d_w_choice, w_choice, acc_number;
        String name, email, number;
        float balance, d_amount, w_amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is a banking system, here you can withdraw or deposit, account creation comes soon");
        System.out.println("Before we move any further please enter your bank details. :)");
        System.out.print("Name: ");
        name = scanner.next();
        bank customer1 = new bank();
        customer1.setName(name);
        System.out.print("Enter your account number: ");
        acc_number = scanner.nextInt();
        customer1.setAcc_number(acc_number);
        System.out.print("Enter your email: ");
        email = scanner.next();
        customer1.setEmail(email);
        System.out.print("Enter the balance amount in your bank: ");
        balance = scanner.nextFloat();
        customer1.setBalance(balance);
        System.out.print("Enter your phone number: ");
        number = scanner.next();
        customer1.setPhone(number);
        System.out.println("As we have gathered your bank details lets move on.");
        System.out.print("Do you want to Deposit('1') or Withdraw('2'): ");
        d_w_choice = scanner.nextInt();
        if(d_w_choice == 1){
            System.out.print("Amount you want to deposit: ");
            d_amount = scanner.nextFloat();
            customer1.deposit(d_amount);
        }else if(d_w_choice == 2){
            System.out.print("Amount you want to withdraw: ");
            w_amount = scanner.nextFloat();
            if(!customer1.withdraw(w_amount)) {
                System.out.println("You have insufficient amount in your bank.");
            }
        }
        System.out.println("After the changes, your bank details are: ");
        System.out.println("Name: "+ customer1.getName());
        System.out.println("Account Number: " + customer1.getAcc_number());
        System.out.println("Email: " + customer1.getEmail());
        System.out.println("Phone: " + customer1.getPhone());
        System.out.println("Balance: " + customer1.getBalance());

        System.out.println("Thank you for using our sevices.");
    }
}
