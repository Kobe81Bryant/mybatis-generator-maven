package com.mapper;

import com.entity.User;
import com.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     *
     * @mbggenerated 2018-09-18
     */
    int countByExample(UserExample example);

    /**
     *
     * @mbggenerated 2018-09-18
     */
    int deleteByExample(UserExample example);

    /**
     *
     * @mbggenerated 2018-09-18
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-09-18
     */
    int insert(User record);

    /**
     *
     * @mbggenerated 2018-09-18
     */
    int insertSelective(User record);

    /**
     *
     * @mbggenerated 2018-09-18
     */
    List<User> selectByExample(UserExample example);

    /**
     *
     * @mbggenerated 2018-09-18
     */
    User selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-09-18
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbggenerated 2018-09-18
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbggenerated 2018-09-18
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbggenerated 2018-09-18
     */
    int updateByPrimaryKey(User record);
}