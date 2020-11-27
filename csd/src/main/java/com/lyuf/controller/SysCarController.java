package com.lyuf.controller;


import com.lyuf.pojo.SysCar;
import com.lyuf.service.SysCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
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
@RequestMapping("/carsys/car")
public class SysCarController {

    @Autowired
    SysCarService sysCarService;

    @RequestMapping("price.do")
    private Map price(String getid) {

        List<SysCar> cars = sysCarService.findByCityid(getid);

        HashMap<String, Object> map = new HashMap<>();

        map.put("code", "1");
        map.put("info", cars);

        System.out.println(cars);
        return map;
    }

    @RequestMapping("number.do")
    private Map number(String getid) {

        List<SysCar> cars = sysCarService.findByCityidOrderByNumber(getid);

        HashMap<String, Object> map = new HashMap<>();

        map.put("code", "1");
        map.put("info", cars);

        System.out.println(cars);
        return map;
    }

    @RequestMapping("findcar.do")
    private Map findcar(Integer cid) {
        HashMap<String, Object> map = new HashMap<>();

        SysCar byId = sysCarService.findById(cid);

        map.put("code","1");
        map.put("info",byId);

        return map;
    }
}
