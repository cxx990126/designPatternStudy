package cxx.study.designpattern._1_single;

/**
 * @author caoxinxiang
 * @date 2023/10/27
 * @description 懒汉式
 */
public class TwoSingle {

    private static TwoSingle instance = null ;

    private TwoSingle () {

    }

    public synchronized static TwoSingle getInstance() {
        if (instance == null) {
            instance = new TwoSingle();
        }
        return instance;
    }
}
