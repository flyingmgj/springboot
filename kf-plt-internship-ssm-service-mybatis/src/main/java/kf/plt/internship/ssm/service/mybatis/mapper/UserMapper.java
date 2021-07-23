package kf.plt.internship.ssm.service.mybatis.mapper;

import java.util.List;
import java.util.Map;

import kf.plt.internship.ssm.service.mybatis.bean.User;

public interface UserMapper {
	//查询全部用户
	List<User> selectUser();
	//根据id查询用户
	   User selectUserById(int id);
	//分页查询用户
	 List<User> selectUserByPage(Map<String,Integer> map);
}
