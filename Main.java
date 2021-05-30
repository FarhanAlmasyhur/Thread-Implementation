/**
 * Class Main merupakan class yang digunakan untuk
 * menjalankan program yang dibuat
 * @author Group 1 - Pemrograman Berorientasi Objek 01
 * @version 30/05/2021
 */
public class Main 
{
    /**
     * Main method dari program
     * @param args Arguments
     */
    public static void main(String[] args) 
    {
        SavingsAccount savingsAccount = new SavingsAccount(0);
        System.out.println(savingsAccount.toString());
        Thread t1 = new Thread(new DepositRunnable(savingsAccount, 2000));
        Thread t2 = new Thread(new WithdrawRunnable(savingsAccount, 1000));
        t1.start();
        t2.start();
    }
}

/**
 * Class Deposit Runnable merupakan kelas yang digunakan
 * untuk mengimplementasi Thread dengan menggunakan 
 * Runnable untuk menjalankan method deposit
 */
class DepositRunnable implements Runnable
{
    private SavingsAccount savingsAccount;
    private float deposit;

    DepositRunnable(SavingsAccount savingsAccount,float deposit)
    {
        this.savingsAccount = savingsAccount;
        this.deposit = deposit;
    }

    /**
     * State Thread run
     */
    @Override
    public void run() {

        //looping digunakan sehingga program menjadi unpredictable
        for (int i = 0; i < 10000; i++) {
        }
        savingsAccount.deposit(deposit);
        System.out.println("Setelah Deposit : "  + savingsAccount.toString());
        
    }
    
}

/**
 * Class Withdraw Runnable merupakan kelas yang digunakan
 * untuk mengimplementasi Thread dengan menggunakan 
 * Runnable untuk menjalankan method withdraw
 */
class WithdrawRunnable implements Runnable
{
    private SavingsAccount savingsAccount;
    private float withdraw;

    WithdrawRunnable(SavingsAccount savingsAccount,float withdraw)
    {
        this.savingsAccount = savingsAccount;
        this.withdraw = withdraw;
    }

    /**
     * State Thread run
     */
    @Override
    public void run() {

        //looping digunakan sehingga program menjadi unpredictable
        for (int i = 0; i < 10000; i++) {
        }
        savingsAccount.withdraw(withdraw);
        System.out.println("Setelah withdraw : " + savingsAccount.toString());

        
    }
    
}