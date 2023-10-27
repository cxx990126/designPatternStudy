package cxx.study.designpattern;

import cxx.study.designpattern._1_single.CacheManager;
import cxx.study.designpattern._1_single.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignPatternApplicationTests {

    @Test
    void contextLoads() {
        DesignPatternApplicationTests designPatternApplicationTests = new DesignPatternApplicationTests() {
            @Override
            public User getUser(Long userId) {
                return null;
            }
        };
        System.out.println(designPatternApplicationTests.getUser(null));
    }

    public User getUser(Long userId) {
        return CacheManager.getInstance().getUser(userId);
    }

}
