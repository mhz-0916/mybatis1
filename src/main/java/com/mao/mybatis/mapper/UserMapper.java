package com.mao.mybatis.mapper;

import com.mao.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Author: maohongzhi
 */
@Mapper
public interface UserMapper {
    public User getUserById(Integer id);


}
