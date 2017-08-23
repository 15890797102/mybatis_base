package com.starry.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.starry.entity.User;

public class Test1 {

	Logger loger=Logger.getLogger(Test1.class);
	private static final String my_path="mybatis-config.xml";
	private static InputStream is=null;
	private static SqlSessionFactory sqlSessionFactory;
	
	static{
		try {
			is=Resources.getResourceAsStream(my_path);
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		SqlSessionFactory sqlSession=Test1.sqlSessionFactory;
		SqlSession session=sqlSession.openSession();
		List<User> lists=session.selectList("user.find66");
		System.out.println(lists.size());
		
		for(User lis :lists) {
			System.out.println(lis.getUserName());
		}
	}
	
}
