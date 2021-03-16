package org.itstep.controller;

import org.itstep.data.Datum;
import org.itstep.service.ReqresUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final ReqresUserService userService;

    public HomeController(ReqresUserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String index(Model model) {
        List<Datum> allUsers = userService.getAllUsers();
        model.addAttribute("allUsers", allUsers);
        return "index";
    }
}
