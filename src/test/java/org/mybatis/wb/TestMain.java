package org.mybatis.wb;

import org.mybatis.wb.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 *
 * @author wangbin33
 * @date 2020/5/10 18:59
 */
public class TestMain {
  public static void main(String[] args) {
    String configFile = "spring.xml";

    ApplicationContext acx = new ClassPathXmlApplicationContext(configFile);

    UserMapper userMapper = acx.getBean(UserMapper.class);

    User user = userMapper.selectById(1);
    System.out.println(user);
  }
}
