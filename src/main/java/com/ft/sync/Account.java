package com.ft.sync;

import java.util.concurrent.TimeUnit;

/**
 * 用来模拟银行账户
 * Created by poseture on 2017/8/20.
 */
public class Account {

    //余额
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public synchronized void addAmount(double amount){
        double tmp = balance;

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tmp -=amount;
        balance = tmp;
    }

    public synchronized void subtractAmount(double amount){

        double tmp = balance;

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tmp-=amount;
        balance = tmp;

    }
}
