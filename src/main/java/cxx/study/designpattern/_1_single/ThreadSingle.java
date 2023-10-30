package cxx.study.designpattern._1_single;

/**
 * @author caoxinxiang
 * @date 2023/10/30
 * @description
 */
public class ThreadSingle {

    private static final ThreadLocal<ThreadSingle> threadLocal = new ThreadLocal<>();

    private ThreadSingle() {
    }

    public static ThreadSingle getInstance() {
        ThreadSingle threadSingle = threadLocal.get();
        if (threadSingle == null) {
            threadSingle = new ThreadSingle();
            threadLocal.set(threadSingle);
        }
        return threadSingle;
    }
}
