package cn.itheima.ssm.controller;

import cn.itheima.ssm.po.Users;
import cn.itheima.ssm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UsersService usersService;
    @RequestMapping("login")
    public String login(){
        return "login";
    }
    @RequestMapping("doLogin")
    public String doLogin(Model model, Users users, HttpSession session){
        Users user = usersService.findUsers(users);
        if (user!=null){
            model.addAttribute("user",user);
            session.setAttribute("user",user);
            return "success";
        }else {
            return "register";
        }
    }
    @RequestMapping("ooo")
    public String success(){
        return "success";
    }

    @RequestMapping("doRegister")
    public String zhuce(Users users){
        usersService.zhuce(users);
        return "redirect:/user/login";
    }
}
