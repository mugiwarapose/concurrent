package com.ft.sync;

/**
 * 模拟公司给账户打钱
 * Created by poseture on 2017/8/20.
 */
public class Company implements  Runnable {

    private Account account;

    public Company(Account account) {
        this.account = account;
    }

    public void run() {
        for(int i=0;i<100;i++){
            account.addAmount(1000);
        }
    }
}
