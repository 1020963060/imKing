package com.imKing.controller.user;

import com.imKing.common.result.R;
import com.imKing.domain.User;
import com.imKing.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RestController=@ResponseBody+@Controller
public class UserController {
    @Autowired
    private UserService userService;
    //新增
    @RequestMapping("/usersave.do")
    public R usersave(User user) {
        return userService.save(user);
    }

}
