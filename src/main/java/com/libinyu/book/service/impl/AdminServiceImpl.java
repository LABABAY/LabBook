package com.libinyu.book.service.impl;

import com.libinyu.book.mapper.AdminMapper;
import com.libinyu.book.pojo.Admin;
import com.libinyu.book.pojo.AdminExample;
import com.libinyu.book.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Created by Administrator on 2018/5/23.
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public List<Admin> list() {
        AdminExample example = new AdminExample();
        example.setOrderByClause("id desc");
        return adminMapper.selectByExample(example);
    }

    @Override
    public void add(Admin admin) {
        adminMapper.insert(admin);
    }

    @Override
    public void delete(int id) {
        adminMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Admin get(int id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Admin admin) {
        adminMapper.updateByPrimaryKeySelective(admin);
    }
    @Override
    public Admin get(String name, String password) {
        AdminExample example = new AdminExample();
        example.createCriteria().andAccountEqualTo(name).andPasswordEqualTo((password));
        List<Admin> result = adminMapper.selectByExample(example);
        if (result.isEmpty()) {
            return null;
        }
        return result.get(0);
    }
}

