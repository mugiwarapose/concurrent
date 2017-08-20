package com.ft.sync;

/**
 * 模拟银行收费 调用subtractAmount() 减少余额
 * Created by poseture on 2017/8/20.
 */
public class Bank implements Runnable{

    private Account account;

    public Bank(Account account) {
        this.account = account;
    }

    public void run() {
            for(int i=0;i<100;i++){
                account.setBalance(1000);
            }
    }
}
