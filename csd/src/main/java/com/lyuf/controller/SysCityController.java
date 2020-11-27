package com.lyuf.controller;


import com.lyuf.pojo.SysCar;
import com.lyuf.pojo.SysCity;
import com.lyuf.service.SysCarService;
import com.lyuf.service.SysCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lyuf
 * @since 2020-11-20
 */
@RestController
@RequestMapping("/carsys/city")
public class SysCityController {

    @Autowired
    SysCityService sysCityService;


    @RequestMapping("select.do")
    public Object selectCity(Integer pid) {

        List<SysCity> all = sysCityService.findByPid(pid);

        HashMap<String, Object> map = new HashMap<>();

        map.put("info", all);
        return map;
    }

    @RequestMapping("citys.do")
    public Map<String, Object> citys(String getid, String backid) {

        HashMap<String, Object> citys = new HashMap<>();
        HashMap<String , Object> map = new HashMap<>();

        SysCity getCity = sysCityService.findByid(getid);
        SysCity backCity = sysCityService.findByid(backid);


        citys.put("getCity", getCity);
        citys.put("backCity", backCity);

        map.put("info", citys);
        map.put("code", 1);

        return map;
    }

}
