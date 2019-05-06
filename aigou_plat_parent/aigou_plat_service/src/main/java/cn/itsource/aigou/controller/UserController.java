package cn.itsource.aigou.controller;

import cn.itsource.aigou.AjaxResult;
import cn.itsource.aigou.domain.User;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        //逻辑判断
        if(user!=null && !StringUtils.isEmpty(user.getName())&& !StringUtils.isEmpty(user.getPwd())){
            String name = user.getName();
            String pwd = user.getPwd();
            if("admin".equals(name)&&"xxx".equals(pwd)){
                return AjaxResult.me();
            }
        }
        return  AjaxResult.me().setSuccess(false).setMsg("登录失败");
    }

    // /user/login2
    @RequestMapping(value = "/login2",method = RequestMethod.GET)
    public AjaxResult login(){
        System.out.println("9999999999999999999999");
        return  AjaxResult.me().setSuccess(false).setMsg("登录失败!!!");
    }
}
