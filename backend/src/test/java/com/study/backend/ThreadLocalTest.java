package com.study.backend;

import org.junit.jupiter.api.Test;

/**
 * @author SummCoder
 * @desc
 * @date 2024/3/15 23:48
 */
public class ThreadLocalTest {

    @Test
    public void testThreadLocalSetAndGet() {
        // 提供一个ThreadLocal对象
        ThreadLocal tl = new ThreadLocal();

        // 开启两个线程
        new Thread(() -> {
            tl.set("萧炎");
            System.out.println(Thread.currentThread().getName() + ": " + tl.get());
            System.out.println(Thread.currentThread().getName() + ": " + tl.get());
            System.out.println(Thread.currentThread().getName() + ": " + tl.get());
        }, "蓝色").start();

        new Thread(() -> {
            tl.set("药尘");
            System.out.println(Thread.currentThread().getName() + ": " + tl.get());
            System.out.println(Thread.currentThread().getName() + ": " + tl.get());
            System.out.println(Thread.currentThread().getName() + ": " + tl.get());
        }, "绿色").start();
    }
}
