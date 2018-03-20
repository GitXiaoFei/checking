package lxf.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lxf.ssm.dao.UserMapper;
import lxf.ssm.service.IUserService;
import lxf.ssm.vo.User;

@Service("userService")
public class UserService implements IUserService   {
	@Resource
	private UserMapper userDao;
	
	public User getUserById(int userId){
		return this.userDao.selectByPrimaryKey(userId);
	}

}