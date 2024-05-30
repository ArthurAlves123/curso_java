import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int acc_number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String acc_holder = sc.nextLine();
        System.out.print("Initial Balance: ");
        double acc_balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(acc_number, acc_holder, acc_balance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        try{
            account.withdraw(amount);
            System.out.printf("New balance: %.2f%n", account.getAcc_balance());
        }
        catch (BusinessException e){
            System.out.println("withdraw error: " + e.getMessage());
        }
        catch (Exception e){
            System.out.println("Unkown error");
        }
        
        sc.close();
    }
}
