package com.lyuf.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lyuf.pojo.SysOrder;
import com.lyuf.service.SysCarService;
import com.lyuf.service.SysOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lyuf
 * @since 2020-11-20
 */
@RestController
@RequestMapping("/carsys/order")
public class SysOrderController {

    @Autowired
    SysOrderService sysOrderService;
    @Autowired
    SysCarService sysCarService;

    @RequestMapping("add.do")
    public Map add(SysOrder sysOrder, HttpServletRequest request,Integer cid){

        HttpSession session = request.getSession();

        Integer uid = (Integer) session.getAttribute("uid");

        sysOrder.setStatus("已预订");
        sysOrder.setUid(uid);
        sysOrder.setCarid(cid);
        System.out.println(sysOrder);

        HashMap<String, Object> map = new HashMap<>();

        sysOrderService.add(sysOrder);

        map.put("info",sysOrder);

        return map;
    }

    @RequestMapping("all.do")
    public Map all(Integer page,HttpServletRequest request){

        HashMap<Object, Object> map = new HashMap<>();
        String uid = request.getSession().getAttribute("uid").toString();

        PageHelper.startPage(page, 4);

        List<SysOrder> orderList = sysOrderService.all(uid);

        System.out.println(orderList);

        PageInfo<SysOrder> pageInfo = new PageInfo<>(orderList);

        map.put("code", "1");
        map.put("info", pageInfo);
        map.put("uid",uid);

        return map;
    }
}
