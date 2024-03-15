package com.study.backend.utils;

/**
 * @author SummCoder
 * @desc ThreadLocal工具类
 * @date 2024/3/16 0:00
 */
@SuppressWarnings("all")
public class ThreadLocalUtil {
    //提供ThreadLocal对象,全局唯一
    private static final ThreadLocal THREAD_LOCAL = new ThreadLocal();

    //根据键获取值
    public static <T> T get() {
        return (T) THREAD_LOCAL.get();
    }

    //存储键值对
    public static void set(Object value) {
        THREAD_LOCAL.set(value);
    }


    //清除ThreadLocal 防止内存泄漏
    public static void remove() {
        THREAD_LOCAL.remove();
    }
}
