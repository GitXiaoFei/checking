package lxf.ssm.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import lxf.ssm.vo.User;

@Component
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}