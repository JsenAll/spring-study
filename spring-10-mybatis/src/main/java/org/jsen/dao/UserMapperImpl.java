package org.jsen.dao; /*
 *@author Jsen
 *@description
 */

import org.jsen.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
import java.util.Map;

public class UserMapperImpl implements UserMapper {


    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
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
