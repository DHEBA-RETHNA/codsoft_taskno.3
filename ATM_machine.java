import java.util.Scanner;
import java.util.Random;
class Bank_Account {
    public int account(int balance) {
        int account_balance = balance;
        return account_balance;} }
class ATM_machine {
    void withdraw(int amount, int balance) {
        if (amount > balance) {
            System.out.println("Withdrawal failed");
        } else {
            balance -= amount;
            System.out.println("Withdrawal success");
            checkbalance(balance);} }
    void deposit(int amount, int balance) {
        balance += amount;
        System.out.println("The amount deposited successfully");
        checkbalance(balance);}
    void checkbalance(int balance) {
        System.out.println("Your account balance is : "+balance);}
    boolean repeat(Scanner scan) {
        System.out.println("Do you want to do any other process?(yes/no)");
        String process = scan.nextLine();
        return process.equalsIgnoreCase("no");}
    public static void main(String[] args) {
        Bank_Account bankob = new Bank_Account();
        ATM_machine atmob = new ATM_machine();
        Random ran = new Random();
        int min=500,max=100000;
        int account = ran.nextInt(max-min+1)+min;
        int balance = bankob.account(account);
        while(true) {
            System.out.println("What do you want to do?(withdraw, deposit, check balance)");
            Scanner scan = new Scanner(System.in);
            String process = scan.nextLine();
            if ("withdraw".equals(process)) {
                System.out.println("Enter the amount to withdraw: ");
                int amount = scan.nextInt();
                scan.nextLine();
                atmob.withdraw(amount, balance);
            } else if ("deposit".equals(process)) {
                System.out.println("Enter the amount to deposit: ");
                int amount = scan.nextInt();
                scan.nextLine();
                atmob.deposit(amount, balance);
            } else if ("check balance".equals(process)) {
                atmob.checkbalance(balance);
            } else {
                System.out.println("Wrong input");
                continue;}
            if (atmob.repeat(scan)) {
                break;} } } }