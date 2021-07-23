package kf.plt.internship.ssm.service.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import kf.plt.internship.ssm.service.mybatis.bean.User;
import kf.plt.internship.ssm.service.mybatis.mapper.UserMapper;
import kf.plt.internship.ssm.service.mybatis.util.MybatisUtil;

public class MyTest {
	
/*	@Test
	public void selectUser()  {
		SqlSession session = MybatisUtil.getSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		List<User> users = userMapper.selectUser();
		for (User user: users){
	           System.out.println(user);
	      }
	}*/
	
/*	@org.junit.Test
    public void testSelectUserById() { 
        SqlSession session = MybatisUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = null;
        for (int i = 3; i >= 1; i--) {
            user = mapper.selectUserById(i);
            System.out.println(user);
        }
        session.close();
    }
*/
	@Test
	public void selectUser()  {
		SqlSession session = MybatisUtil.getSession();
		   UserMapper mapper = session.getMapper(UserMapper.class);

		   int currentPage = 1;  //第几页
		   int pageSize = 2;  //每页显示几个
		   Map<String,Integer> map = new HashMap<String,Integer>();
		   map.put("startIndex",(currentPage-1)*pageSize);
		   map.put("pageSize",pageSize);

		   List<User> users = mapper.selectUserByPage(map);

		   for (User user: users){
		       System.out.println(user);
		  }

		   session.close();
	 }
	


}
