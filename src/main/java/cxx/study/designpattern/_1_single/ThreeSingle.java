package cxx.study.designpattern._1_single;

/**
 * @author caoxinxiang
 * @date 2023/10/27
 * @description 双重检测实现
 */
public class ThreeSingle {

    /**
     * 添加volatile是为了解决cpu指令重排可能导致的 其他线程使用到还未执行完FourSingle()构造函数的instance对象
     */
    private static volatile ThreeSingle instance = null;

    private ThreeSingle() {

    }

    public static synchronized ThreeSingle getInstance() {
        if (instance == null) {
            synchronized (ThreeSingle.class) {
                if (instance == null) {
                    instance = new ThreeSingle();
                }
            }
        }
        return instance;
    }
}
