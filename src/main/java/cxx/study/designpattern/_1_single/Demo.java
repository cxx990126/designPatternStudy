package cxx.study.designpattern._1_single;

public class Demo {
//  private UserRepo userRepo; // 通过构造哈函数或IOC容器依赖注入

  public boolean validateCachedUser(long userId) {
//    User actualUser = userRepo.getUser(userId);
    return false;
    // 省略核心逻辑：对比cachedUser和actualUser...
  }

}