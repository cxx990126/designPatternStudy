package cxx.study.designpattern._1_single;

/**
 * @author caoxinxiang
 * @date 2023/10/27
 * @description
 */
public class CacheManager {

    private static CacheManager instance = new CacheManager();

    private CacheManager() {
    }

    public static CacheManager getInstance() {
        return instance;
    }

    public User getUser(Long userId) {
        //可能是查询数据库得到一个user
        return new User();
    }

    public User instanceGetUser(Long userId) {
        return instance.getUser(userId);
    }
}
