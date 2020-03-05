package org.jsen.dao; /*
 *@author Jsen
 *@description
 */

import org.apache.ibatis.session.SqlSession;
import org.jsen.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;


public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {

    public List<User> selectUser() {
        return getSqlSession().getMapper(UserMapper.class) .selectUser();
    }

    public User getUserById(int id) {
        return null;
    }

    public int addUser(User user) {
        return 0;
    }

    public int upDateUser(User user) {
        return 0;
    }

    public List<User> selectUserLike(Map<String, Object> map) {
        return null;
    }

    public int delUser(int id) {
        return 0;
    }
}
