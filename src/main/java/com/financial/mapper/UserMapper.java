package com.financial.mapper;

import com.financial.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User getNameById(User user);
}
