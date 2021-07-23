package kf.plt.internship.ssm.service.mybatis.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kf.plt.internship.ssm.service.mybatis.bean.User;
import kf.plt.internship.ssm.service.mybatis.mapper.UserMapper;

public class MybatisUtil {
		private static SqlSessionFactory sqlSessionFactory;
		
		static {
			 try {
				String resource = "mybatis-config.xml";
				InputStream inputStream = Resources.getResourceAsStream(resource);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			} catch (Exception e) {
					e.printStackTrace();
			}
		}
		//获取SqlSession连接
		public static SqlSession getSession(){
		       return sqlSessionFactory.openSession();
		}
}
