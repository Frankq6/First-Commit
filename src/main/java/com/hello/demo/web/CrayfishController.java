package com.hello.demo.web;

import com.hello.demo.entity.Crayfish;
import com.hello.demo.service.CrayfishService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.modelmbean.ModelMBean;

@RestController
@RequestMapping("/fish")
public class CrayfishController {
    @Autowired
    private CrayfishService crayfishService;

    @RequestMapping(value="/listcrayfish", method = RequestMethod.GET)
    private Map<String, Object> listCrayfish(){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Crayfish> list = crayfishService.getCrayfishList();
        modelMap.put("crayfishlist", list);
        return modelMap;
    }

    @RequestMapping(value = "/getcrayfishbyid", method = RequestMethod.GET)
    private Map<String, Object> getCrayfishById(Integer fid){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Crayfish> crayfish = crayfishService.getCrayfishById(fid);
        modelMap.put("crayfish", crayfish);
        return modelMap;
    }

}
