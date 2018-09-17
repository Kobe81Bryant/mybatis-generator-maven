package com.mapper;

import com.entity.User;
import com.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     *
     * @mbggenerated 2018-09-16
     */
    int countByExample(UserExample example);

    /**
     *
     * @mbggenerated 2018-09-16
     */
    int deleteByExample(UserExample example);

    /**
     *
     * @mbggenerated 2018-09-16
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-09-16
     */
    int insert(User record);

    /**
     *
     * @mbggenerated 2018-09-16
     */
    int insertSelective(User record);

    /**
     *
     * @mbggenerated 2018-09-16
     */
    List<User> selectByExample(UserExample example);

    /**
     *
     * @mbggenerated 2018-09-16
     */
    User selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-09-16
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbggenerated 2018-09-16
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbggenerated 2018-09-16
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbggenerated 2018-09-16
     */
    int updateByPrimaryKey(User record);
}