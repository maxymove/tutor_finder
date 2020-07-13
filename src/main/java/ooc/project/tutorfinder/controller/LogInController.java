package ooc.project.tutorfinder.controller;

import ooc.project.tutorfinder.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LogInController {

    @Autowired
    private SecurityService securityService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginForm() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doLogin(@RequestParam String username, @RequestParam String password, Model model) {
        if (securityService.login(username, password)) {
            return "redirect:/user/" + username;
        } else {
            model.addAttribute("error", "Wrong username or password");
            return "login";
        }
    }
}
