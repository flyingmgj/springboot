package kf.plt.internship.ssm.service.mybatis.bean;

import lombok.Data;

@Data
public class User {
	private int id;
	private String account;
	private String password;
	private String name;
	private Integer type;
}
