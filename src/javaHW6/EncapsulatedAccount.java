package javaHW6;

public class EncapsulatedAccount {

    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public static void main(String[] args) {

        EncapsulatedAccount en =new EncapsulatedAccount();
        en.setAccountNumber("tr2003");
        en.setBalance(2000.21);

        String accountNumber= en.getAccountNumber();
        double balance = en.getBalance();

        System.out.println(accountNumber);
        System.out.println(balance);

    }
}
