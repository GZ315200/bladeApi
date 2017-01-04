package org.drill.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.drill.model.po.User;
import org.drill.model.po.UserExample;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {

    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}