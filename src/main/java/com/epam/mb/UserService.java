package com.epam.mb;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class UserService implements UserMapper {

    /*
     * (non-Javadoc)
     * @see main.java.com.epam.mb.UserMapper#findAllUsers()
     */
    public List<User> findAllUsers() {

        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            return userMapper.findAllUsers();
        }
        finally {
            sqlSession.close();
        }

    }

    /*
     * (non-Javadoc)
     * @see main.java.com.epam.mb.UserMapper#findUserById(int)
     */
    public User findUserById(int id) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            return userMapper.findUserById(id);
        }
        finally {
            sqlSession.close();
        }

    }

    /*
     * (non-Javadoc)
     * @see
     * main.java.com.epam.mb.UserMapper#insertUser(main.java.com.epam.mb.User)
     */
    public void insertUser(User user) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userMapper.insertUser(user);
            sqlSession.commit();
        }
        finally {
            sqlSession.close();
        }

    }

}
