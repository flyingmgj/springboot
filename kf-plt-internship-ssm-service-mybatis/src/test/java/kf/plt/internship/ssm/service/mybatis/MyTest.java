package kf.plt.internship.ssm.service.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import kf.plt.internship.ssm.service.mybatis.bean.User;
import kf.plt.internship.ssm.service.mybatis.mapper.UserMapper;
import kf.plt.internship.ssm.service.mybatis.util.MybatisUtil;

public class MyTest {
	@Test
	public void selectUser()  {
		SqlSession session = MybatisUtil.getSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		List<User> users = userMapper.selectUser();
		for (User user: users){
	           System.out.println(user);
	      }
	}
	
	@org.junit.Test
    public void testSelectUserById() {
        //获取sqlsession连接
        SqlSession session = MybatisUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = null;
        for (int i = 3; i >= 1; i--) {
            user = mapper.selectUserById(i);
            System.out.println(user);
        }

        session.close();
    }

}
