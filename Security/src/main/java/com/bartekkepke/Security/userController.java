package com.bartekkepke.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class userController {

    @Autowired
    userrepinterface userService;

    @RequestMapping("/users")
    @GetMapping
    public String getUsers(Model userModel)
    {
        List<Users> users = userService.findAll();
        userModel.addAttribute("users", users);
        return "users";
    }

    @RequestMapping("/users/new")
    @GetMapping
    public String AddUser(Model userModel)
    {
        userModel.addAttribute("user", new Users());
        return "adduser";
    }


    @PostMapping("/users/save")
    public String SaveUserAction(Users users)
    {
        userService.save(users);
        return "redirect:/users";
    }






}
