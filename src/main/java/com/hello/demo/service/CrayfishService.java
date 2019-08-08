package com.hello.demo.service;

import com.hello.demo.entity.Crayfish;

import java.util.List;

public interface CrayfishService {
    List<Crayfish> getCrayfishList();
    List<Crayfish> getCrayfishById(int fid);
}
