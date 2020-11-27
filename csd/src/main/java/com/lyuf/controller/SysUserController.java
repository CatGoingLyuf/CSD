package com.lyuf.controller;


import com.lyuf.pojo.SysUser;
import com.lyuf.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
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
@RequestMapping("/carsys/user")
public class SysUserController {

    @Autowired
    SysUserService sysUserService;

    @RequestMapping("login.do")
    public Map login(String tel, String password, HttpServletRequest request) {

        SysUser byTelAndPsd = sysUserService.findByTelAndPsd(tel, password);

        System.out.println(byTelAndPsd);

        HttpSession session = request.getSession(true);
        session.setAttribute("uid", byTelAndPsd.getId());
        session.setMaxInactiveInterval(60 * 60);


        HashMap<String, Object> map = new HashMap<>();

        if (byTelAndPsd != null) {

            map.put("sysuer",byTelAndPsd);
            map.put("code",1);
            map.put("uid",byTelAndPsd.getId());
            return map;

        }else {
            map.put("info","用户名密码错误");
            return map;
        }

    }

    @RequestMapping("register.do")
    public Map<String, Object> register(SysUser sysUser){
        System.out.println(sysUser);
        HashMap<String, Object> map = new HashMap<>();
        sysUserService.addUser(sysUser);

        SysUser byTelAndPsd = sysUserService.findByTelAndPsd(sysUser.getTel(), sysUser.getPassword());
        if (byTelAndPsd != null) {

            map.put("sysuer",byTelAndPsd);
            map.put("code",1);

            return map;

        }else {
            map.put("info","用户名密码错误");

            return map;
        }

    }

    @RequestMapping("denglu.do")
    public Map denglu(HttpServletRequest request){

        HashMap<String, Object> map = new HashMap<>();
        String uid = request.getSession().getAttribute("uid").toString();

        System.out.println(uid);

        SysUser byId = sysUserService.findById(uid);

        map.put("code","1");
        map.put("info",byId);

        return map;

    }
    @RequestMapping("update.do")
    public Map update(){

        HashMap<String, Object> map = new HashMap<>();

        return map;

    }
}
