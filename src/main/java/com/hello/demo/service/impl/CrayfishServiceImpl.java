package com.hello.demo.service.impl;

import com.hello.demo.dao.CrayfishDao;
import com.hello.demo.entity.Crayfish;
import com.hello.demo.service.CrayfishService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrayfishServiceImpl implements CrayfishService {

    @Autowired
    private CrayfishDao crayfishDao;

    @Override
    public List<Crayfish> getCrayfishList() {
        return crayfishDao.queryCrayfish();
    }

    @Override
    public List<Crayfish> getCrayfishById(int fid) {
        return crayfishDao.queryCrayfishById(fid);
    }
}
