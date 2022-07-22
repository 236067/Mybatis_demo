package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class User {
    public static void main(String[] args)throws Exception {
        String resource = "m.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession=sqlSessionFactory.openSession();
        List <App>selectList=sqlSession.selectList("test.selectBlog");

        System.out.println(selectList);
        sqlSession.close();

    }

}
