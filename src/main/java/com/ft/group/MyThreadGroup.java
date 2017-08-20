package com.ft.group;

/**
 * 处理线程抛出的未捕获的异常
 * Created by poseture on 2017/8/20.
 */
public class MyThreadGroup extends ThreadGroup {
    public MyThreadGroup(String name) {
        super(name);
    }

    /**
     * 覆盖该方法
     * @param t
     * @param e
     */
    @Override
    public void uncaughtException(Thread t, Throwable e) {

        System.out.printf("the Thread %s has throw an Exception\n",t.getId());

        e.printStackTrace(System.out);

        System.out.printf("Terminating the rest of threads \n");

//        中断线程组中的其他线程
        interrupt();
    }
}
