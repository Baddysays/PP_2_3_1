package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.UserService;


    @Controller
    @RequestMapping("/users")
    public class UserController {

        private final UserService serviceUser;

        @Autowired
        public UserController(UserService serviceUser) {
            this.serviceUser = serviceUser;
        }

        @GetMapping("")
        public String getListOfUser(@RequestParam(value = "count", defaultValue = "6", required = false) int count, Model model) {
            model.addAttribute("list", serviceUser.getListOfUser(count, serviceUser.getFullListOfUser()));
            return "users";
        }
        @GetMapping("/{id}")
        public String idShow(@PathVariable("id")int id, Model model) {
            model.addAttribute("user", serviceUser.idShow(id));
            return "/idShow";
        }

    }

