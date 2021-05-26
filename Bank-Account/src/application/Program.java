package application;

import entities.BanckAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("inform the account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("please provide the name of the account holder: ");
        String name = sc.nextLine();

        System.out.print("will you make an initial deposit (y/n) ? ");
        char op = sc.next().charAt(0);
        System.out.println();

        BanckAccount banckAccount;
        if (op == 'Y' || op == 'y') {

            System.out.print("\nEnter initial deposit value: ");
            double initialDeposit = sc.nextDouble();

            banckAccount = new BanckAccount(accountNumber, name, initialDeposit);
        } else {
            banckAccount = new BanckAccount(accountNumber, name);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println("Account " + banckAccount);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        banckAccount.depositAccount(deposit);

        System.out.println();

        System.out.println("\nUpdate account data:");
        System.out.print(banckAccount);

        System.out.println();
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        banckAccount.withdrawAccount(withdraw);

        System.out.println();
        System.out.println("Update account data: ");
        System.out.println(banckAccount);
        System.out.println();

        sc.close();
    }

}