package fundamental.localThread;

import java.util.Random;

public class SynchronizedDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("accountOfMG",10000.00);
        for(int i=0;i<100;i++){
            new Thread(() -> {
                try {
                    int var = new Random().nextInt(100);
                    Thread.sleep(var);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                double deposit = myAccount.deposit(1000.00);
                System.out.println(Thread.currentThread().getName()+" balance:"+deposit);
            }).start();
        }
        for(int i=0;i<100;i++){
            new Thread(() -> {
                try {
                    int var = new Random().nextInt(100);
                    Thread.sleep(var);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                double deposit = myAccount.withdraw(1000.00);
                System.out.println(Thread.currentThread().getName()+" balance:"+deposit);

            }).start();
        }
    }

    private static class BankAccount{
        String accountName;
        double balance;

        public BankAccount(String accountName,double balance){
            this.accountName = accountName;
            this.balance = balance;
        }

//        public double deposit(double amount){
//            balance = balance + amount;
//            return balance;
//        }
//
//        public double  withdraw(double amount){
//            balance = balance - amount;
//            return balance;
//        }
        //对共享变量进行同步时，在共享变量中加synchronized 进行修饰
        public synchronized double deposit(double amount){
            balance = balance + amount;
            return balance;
        }

        public synchronized double  withdraw(double amount){
            balance = balance - amount;
            return balance;
        }

    }
}
