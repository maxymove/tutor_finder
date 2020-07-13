package ooc.project.tutorfinder.controller;

import ooc.project.tutorfinder.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    private SecurityService securityService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        if (!securityService.isAuthorized()) {
            return "redirect:/login";
        }
        model.addAttribute("username", securityService.getCurrentUsername());
        return "welcome";
    }
}
