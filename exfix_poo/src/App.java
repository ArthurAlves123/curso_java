import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter acount number: ");
        int acc_number = sc.nextInt();
        System.out.print("Enter acount holder: ");
        sc.nextLine();
        String acc_holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if(response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(acc_number, acc_holder, initialDeposit); 
        } else {
            account = new Account(acc_number, acc_holder);
        }

        System.out.println("Account data:");
        System.out.println(account);

        System.out.print("Enter deposit value: ");
        double value = sc.nextDouble();
        account.deposit(value);

        System.out.println();
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();
        account.withdraw(value);

        System.out.println();
        System.out.println("Updated account data:");
        System.out.println(account);
        
        sc.close();
    }
}
