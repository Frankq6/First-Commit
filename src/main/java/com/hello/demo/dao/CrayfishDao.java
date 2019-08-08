package com.hello.demo.dao;

import com.hello.demo.entity.Crayfish;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CrayfishDao {
    List<Crayfish> queryCrayfish();
    List<Crayfish> queryCrayfishById(int fid);
}
