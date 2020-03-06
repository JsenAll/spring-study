package org.jsen.dao;
/**
 * @author Jsen
 * @description
 */

import org.apache.ibatis.session.SqlSession;
import org.jsen.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;


public class UserMapperImpl3 extends SqlSessionDaoSupport implements UserMapper {

    public List<User> selectUser() {
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }

    public User getUserById(int id) {
        return null;
    }

    public int addUser(User user) {

        int i = getSqlSession().getMapper(UserMapper.class).addUser(user);
        System.out.println(1 / 0);//如果没有事务管理 到这 user 已经添加到数据库中了 有了事务 则不会
        return i;
    }

    public int upDateUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).upDateUser(user);
    }

    public List<User> selectUserLike(Map<String, Object> map) {
        return null;
    }

    public int delUser(int id) {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.delUser(id);
    }
}
