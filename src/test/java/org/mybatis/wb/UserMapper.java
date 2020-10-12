package org.mybatis.wb;

import org.mybatis.wb.domain.User;

/**
 * Description:
 *
 * @author wangbin33
 * @date 2020/5/10 18:57
 */
public interface UserMapper {
  User selectById(int id);

  int insertUser(User user);
}
