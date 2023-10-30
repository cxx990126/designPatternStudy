package cxx.study.designpattern._1_single;

/**
 * @author caoxinxiang
 * @date 2023/10/27
 * @description 静态内部类
 */
public class FourSingle {

    private FourSingle() {

    }

    private static class StaticInnerClass {
        private static FourSingle instance = new FourSingle();
    }

    public static FourSingle getInstance() {
       return StaticInnerClass.instance;
    }

}
