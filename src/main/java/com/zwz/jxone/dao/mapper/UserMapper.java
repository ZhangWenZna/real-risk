package com.zwz.jxone.dao.mapper;

import com.zwz.jxone.po.UserPO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    UserPO selectById(Integer uId);
}
