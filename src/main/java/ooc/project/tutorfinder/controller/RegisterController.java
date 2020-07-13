package ooc.project.tutorfinder.controller;

import ooc.project.tutorfinder.entity.Student;
import ooc.project.tutorfinder.repository.StudentRepository;
import ooc.project.tutorfinder.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerForm() {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String doRegister(@RequestParam String fullName, @RequestParam String username, @RequestParam String password,
                             @RequestParam String email, @RequestParam String dob) {
        Student student = new Student(fullName, username, password, email, dob);
        Student savedUser = studentRepository.save(student);
        return "redirect:/register-success";
    }

    @RequestMapping(value = "/register-success", method = RequestMethod.GET)
    public String registerDone() {
        return "register-success";
    }
}
