package com.libinyu.book.mapper;

import com.libinyu.book.pojo.Admin;
import com.libinyu.book.pojo.AdminExample;
import java.util.List;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer admin_id);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer admin_id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}