package cxx.study.designpattern._1_single;

/**
 * @author caoxinxiang
 * @date 2023/10/27
 * @description 饿汉式
 */
public class OneSingle {

    private static final OneSingle instance = new OneSingle();

    private OneSingle() {

    }

    public static final OneSingle getInstance() {
        return instance;
    }

}
