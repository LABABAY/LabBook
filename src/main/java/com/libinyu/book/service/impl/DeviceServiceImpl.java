package com.libinyu.book.service.impl;

import com.libinyu.book.mapper.DeviceMapper;
import com.libinyu.book.pojo.Device;
import com.libinyu.book.pojo.DeviceExample;
import com.libinyu.book.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/5/23.
 */
@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    DeviceMapper deviceMapper;

    @Override
    public List<Device> list() {
        DeviceExample example = new DeviceExample();
        example.setOrderByClause("id desc");
        return deviceMapper.selectByExample(example);
    }

    @Override
    public List<Device> list(int id) {
        DeviceExample example = new DeviceExample();
        example.setOrderByClause("id desc");
        example.createCriteria().andLidEqualTo(id);
        return deviceMapper.selectByExample(example);
    }

    @Override
    public void add(Device device) {
        deviceMapper.insert(device);
    }

    @Override
    public void delete(int id) {
        deviceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Device get(int id) {
        return deviceMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Device device) {
        deviceMapper.updateByPrimaryKeySelective(device);
    }

    @Override
    public List<Device> open(int id) {
        DeviceExample example = new DeviceExample();
        example.setOrderByClause("id desc");
        example.createCriteria().andLidEqualTo(id).andOpenEqualTo("开放");
        return deviceMapper.selectByExample(example);
    }
}
